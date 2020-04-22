package com.zpan.viewbinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.zpan.viewbinding.databinding.AdapterHomeListBinding;
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
        AdapterHomeListBinding listBinding = AdapterHomeListBinding.inflate(LayoutInflater.from(mContext));
        HomeViewHolder viewHolder = new HomeViewHolder(listBinding.getRoot());
        viewHolder.setViewBinding(listBinding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.getViewBinding().tvItem.setText("adapter ViewBinding");
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {

        AdapterHomeListBinding homeListBinding;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public AdapterHomeListBinding getViewBinding() {
            return homeListBinding;
        }

        public void setViewBinding(AdapterHomeListBinding listBinding) {
            this.homeListBinding = listBinding;
        }
    }
}
