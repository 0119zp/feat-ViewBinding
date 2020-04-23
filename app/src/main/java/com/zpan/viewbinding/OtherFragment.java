package com.zpan.viewbinding;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zpan.viewbinding.base.BaseFragment;
import com.zpan.viewbinding.base.TestActivity;
import com.zpan.viewbinding.databinding.FragmentOtherBinding;
import com.zpan.viewbinding.databinding.ItemOtherListBinding;

/**
 * @author zpan
 * @date 2020/4/20 4:53 PM
 */
public class OtherFragment extends BaseFragment<FragmentOtherBinding> {

    @Override
    public FragmentOtherBinding getViewBinding(LayoutInflater inflater, ViewGroup parent) {
        return FragmentOtherBinding.inflate(inflater, parent, false);
    }

    @Override
    protected void exInit() {
        viewBinding.tvTitle.setText("other-fragment 的 title");

        viewBinding.llList.removeAllViews();
        for (int i = 0; i < 10; i++) {
            ItemOtherListBinding listBinding = ItemOtherListBinding.inflate(LayoutInflater.from(getActivity()));
            listBinding.tvText.setText("addView ViewBinding");
            listBinding.tvText.setOnClickListener(v -> {
                startActivity(new Intent(getActivity(), TestActivity.class));
            });
            viewBinding.llList.addView(listBinding.getRoot());
        }
    }
}
