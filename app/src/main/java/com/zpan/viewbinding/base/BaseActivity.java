package com.zpan.viewbinding.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

/**
 * @author zpan
 * @date 2020/4/23 10:37 AM
 *
 * description: activity 基类
 */
public abstract class BaseActivity<T extends ViewBinding> extends AppCompatActivity {

    public T viewBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = getViewBinding();
        setContentView(viewBinding.getRoot());
        exInit();
    }

    /**
     * 初始化
     */
    protected abstract void exInit();

    /**
     * 返回ViewBinding
     *
     * @return viewBinding
     */
    protected abstract T getViewBinding();
}
