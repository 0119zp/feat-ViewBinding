package com.zpan.viewbinding;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zpan.viewbinding.databinding.ActivityMainBinding;

/**
 * @author zpan
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(mainBinding.getRoot());
    }
}
