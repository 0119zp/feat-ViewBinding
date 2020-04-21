package com.zpan.viewbinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/**
 * @author zpan
 * @date 2020/4/20 6:11 PM
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private FragmentActivity mContext;
    private List<String> stringList;

    public HomeAdapter(FragmentActivity activity, List<String> list) {
        this.mContext = activity;
        this.stringList = list;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View homeView = LayoutInflater.from(mContext).inflate(R.layout.adapter_home_list, parent, false);
        return new HomeViewHolder(homeView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.textView.setText("adapter ViewBinding");
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView textView;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_item);
        }
    }
}
