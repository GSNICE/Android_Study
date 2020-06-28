package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_scroll_up;
    private Button getButton_scroll_down;
    private ScrollView scrollView_1;
    private TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        bindViews();
    }

    public void bindViews () {
        button_scroll_up = findViewById(R.id.scroll_button_up);
        getButton_scroll_down = findViewById(R.id.scroll_button_down);

        textView_1 = findViewById(R.id.scrollView_textView);

        button_scroll_up.setOnClickListener(this);
        getButton_scroll_down.setOnClickListener(this);

        scrollView_1 = findViewById(R.id.scrollView_1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ;i <= 100;i++) {
            sb.append("呵呵 * " + i + "\n");
        }
        textView_1.setText(sb.toString());

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                //
                scrollView_1.fullScroll(ScrollView.FOCUS_DOWN);
                break;
            case R.id.button_2:
                //
                scrollView_1.fullScroll(ScrollView.FOCUS_UP);
                break;
        }
    }
}