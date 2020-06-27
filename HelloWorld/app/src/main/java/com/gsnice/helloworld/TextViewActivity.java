package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView textView_4;
    private TextView textView_5;
    private TextView textView_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        textView_4 = findViewById(R.id.tv_4);
        textView_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//  中划线
//        textView_4.getPaint().setAntiAlias(true);//   去除锯齿

        textView_5 = findViewById(R.id.tv_5);
        textView_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//    下划线

        textView_6 = findViewById(R.id.tv_6);
        textView_6.setText(Html.fromHtml("<u>GSNICE 在奔跑</u>"));
    }
}