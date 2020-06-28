package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;

public class ScrollViewActivity extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private ScrollView scrollView_1;
    private Context content_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        content_1 = ScrollViewActivity.this;
        bindViews();
    }

    public void bindViews () {
        button_1 = findViewById(R.id.scroll_button_1);
        button_2 = findViewById(R.id.scroll_button_2);

        scrollView_1 = findViewById(R.id.ScrollView_1);


    }
}