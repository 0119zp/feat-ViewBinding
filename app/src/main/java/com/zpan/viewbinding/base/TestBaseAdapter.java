package com.zpan.viewbinding.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zpan.viewbinding.databinding.AdapterTestBaseBinding;
import java.util.List;

/**
 * @author zpan
 * @date 2020/4/23 9:48 AM
 *
 * description: 测试基类Adapter
 */
public class TestBaseAdapter extends BaseAdapter<AdapterTestBaseBinding> {

    private List<String> mList;

    public TestBaseAdapter(Context context) {
        super(context);
    }

    public void setData(List<String> list) {
        this.mList = list;
        notifyDataSetChanged();
    }

    @Override
    int itemCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    void onBindHolder(BaseViewHolder<AdapterTestBaseBinding> holder, int position) {
        holder.getBinding().tvTest.setText("base adapter test");
    }

    @Override
    AdapterTestBaseBinding setBinding(LayoutInflater inflater, ViewGroup parent) {
        return AdapterTestBaseBinding.inflate(inflater, parent, false);
    }
}
