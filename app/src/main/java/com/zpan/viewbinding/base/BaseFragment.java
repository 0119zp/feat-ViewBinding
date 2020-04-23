package com.zpan.viewbinding.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

/**
 * @author zpan
 * @date 2020/4/23 4:37 PM
 *
 * description: fragment 基类
 */
public abstract class BaseFragment<T extends ViewBinding> extends Fragment {

    protected T viewBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewBinding = getViewBinding(inflater, container);
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        exInit();
    }

    /**
     * 初始化
     */
    protected abstract void exInit();

    /**
     * 返回 ViewBinding
     *
     * @param inflater inflater
     * @param parent 父布局
     * @return viewBinding
     */
    public abstract T getViewBinding(LayoutInflater inflater, ViewGroup parent);

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // 在Fragment中使用ViewBinding时，要在onDestroyView()方法中把binding的引用移除，不然会引起内存泄漏；
        viewBinding = null;
    }
}
