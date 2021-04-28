package com.winter.androidtestlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.text_view)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtils.init(this);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("type", "r44545");
        intent.putExtra("test", false);
        startActivity(intent);

    }

}