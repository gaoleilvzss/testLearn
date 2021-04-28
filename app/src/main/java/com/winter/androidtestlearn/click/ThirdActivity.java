package com.winter.androidtestlearn.click;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.winter.androidtestlearn.R;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/27
 * desc :
 */
public class ThirdActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Click({R.id.btn1,R.id.btn2})
    private void toast(View view){
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
    }
}
