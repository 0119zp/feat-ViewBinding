package com.zpan.viewbinding.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/**
 * @author zpan
 * @date 2020/4/23 9:23 AM
 *
 * description: 适配器基类
 */
public abstract class BaseAdapter<T extends ViewBinding> extends RecyclerView.Adapter<BaseAdapter.BaseViewHolder> {

    private Context mContext;

    BaseAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return itemCount();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        T viewBinding = setBinding(LayoutInflater.from(mContext), parent);
        BaseViewHolder<T> viewHolder = new BaseViewHolder<>(viewBinding.getRoot());
        viewHolder.setBinding(viewBinding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        BaseViewHolder<T> viewHolder = (BaseViewHolder<T>) holder;
        onBindHolder(viewHolder, position);
    }

    /**
     * 返回条目数
     *
     * @return 条目数
     */
    abstract int itemCount();

    /**
     * 绑定holder
     *
     * @param holder holder
     * @param position 下标
     */
    abstract void onBindHolder(BaseViewHolder<T> holder, int position);

    /**
     * 返回ViewBinding
     *
     * @param inflater inflater
     * @param parent 父布局
     * @return ViewBinding
     */
    abstract T setBinding(LayoutInflater inflater, ViewGroup parent);

    static class BaseViewHolder<T extends ViewBinding> extends RecyclerView.ViewHolder {

        T viewBinding;

        BaseViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        T getBinding() {
            return viewBinding;
        }

        void setBinding(T binding) {
            this.viewBinding = binding;
        }
    }
}
