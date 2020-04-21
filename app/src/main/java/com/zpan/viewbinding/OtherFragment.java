package com.zpan.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.zpan.viewbinding.databinding.FragmentOtherBinding;

/**
 * @author zpan
 * @date 2020/4/20 4:53 PM
 */
public class OtherFragment extends Fragment {

    private FragmentOtherBinding otherBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        otherBinding = FragmentOtherBinding.inflate(inflater, container, false);
        return otherBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        otherBinding.tvTitle.setText("other-fragment 的 title");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // 在Fragment中使用ViewBinding时，要在onDestroyView()方法中把binding的引用移除，不然会引起内存泄漏；
        otherBinding = null;
    }
}
