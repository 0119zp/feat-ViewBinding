package com.zpan.viewbinding;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.zpan.viewbinding.databinding.ActivityMainBinding;

/**
 * @author zpan
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    private HomeFragment homeFragment;
    private OtherFragment otherFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(mainBinding.getRoot());

        setBottomTab();
    }

    private void setBottomTab() {
        mainBinding.btnHome.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (otherFragment != null) {
                transaction.hide(otherFragment);
            }
            if (homeFragment == null) {
                homeFragment = new HomeFragment();
                transaction.add(R.id.fl_content, homeFragment);
            } else {
                transaction.show(homeFragment);
            }
            transaction.commitAllowingStateLoss();
        });
        mainBinding.btnOther.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (homeFragment != null) {
                transaction.hide(homeFragment);
            }
            if (otherFragment == null) {
                otherFragment = new OtherFragment();
                transaction.add(R.id.fl_content, otherFragment);
            } else {
                transaction.show(otherFragment);
            }
            transaction.commitAllowingStateLoss();
        });
    }
}
