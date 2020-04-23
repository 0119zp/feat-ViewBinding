package com.zpan.viewbinding.base;

import android.view.LayoutInflater;
import com.zpan.viewbinding.databinding.ActivityTestBinding;

/**
 * @author zpan
 * @date 2020/4/23 10:41 AM
 *
 * description: activity 测试类
 */
public class TestActivity extends BaseActivity<ActivityTestBinding>{

    @Override
    protected void exInit() {
        viewBinding.tvTextView.setText("test activity");
    }

    @Override
    protected ActivityTestBinding getViewBinding() {
        return ActivityTestBinding.inflate(LayoutInflater.from(this));
    }
}
