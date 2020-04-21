package com.zpan.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zpan.viewbinding.databinding.FragmentHomeBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zpan
 * @date 2020/4/20 4:53 PM
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding homeBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        return homeBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeBinding.tvTitle.setText("home-fragment 的 title");

        homeBinding.rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeBinding.rvList.setAdapter(new HomeAdapter(getActivity(), getList()));
    }

    private List<String> getList() {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        return list;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // 在Fragment中使用ViewBinding时，要在onDestroyView()方法中把binding的引用移除，不然会引起内存泄漏；
        homeBinding = null;
    }
}
