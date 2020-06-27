package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCbAndroid,mCbiOS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        mCbAndroid = findViewById(R.id.checkBox_Android);
        mCbiOS = findViewById(R.id.checkBox_iOS);

        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,b ? "Android 按钮选中" : "Android 按钮未选中",Toast.LENGTH_SHORT).show();
            }
        });

        mCbiOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,b ? "iOS 按钮选中" : "iOS 按钮未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}