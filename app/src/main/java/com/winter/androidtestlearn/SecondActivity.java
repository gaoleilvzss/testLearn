package com.winter.androidtestlearn;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
public class SecondActivity extends AppCompatActivity {
    @AutoWired
    public String type;
    @AutoWired("test")
    public boolean test1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtils.initAutoWired(this);
        Toast.makeText(this, "type = " + type + ",test = " + test1, Toast.LENGTH_SHORT).show();
    }
}
