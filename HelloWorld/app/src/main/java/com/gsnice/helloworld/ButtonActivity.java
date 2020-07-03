package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        //  Button
        button = findViewById(R.id.button_3);
        button.setOnClickListener(this);

        Button button_1 = findViewById(R.id.button_2);
        button_1.setOnClickListener(this);

        //  TextView
        textView = findViewById(R.id.textview_1);
        textView.setOnClickListener(this);
    }

    public void showToast(View view){
        Toast.makeText(this,"我被点击了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_2:
            {
                String s1 = "<font color='blue'><b>百度一下，你就知道~：</b></font><br>";
                s1 += "<a href = 'https://www.baidu.com'>百度</a>";
                Button testButton = findViewById(R.id.button_2);
                testButton.setText(Html.fromHtml(s1));
                testButton.setMovementMethod(LinkMovementMethod.getInstance());
            }
                break;
            case R.id.button_3 :
                Toast.makeText(ButtonActivity.this,"按钮3被点击了",Toast.LENGTH_LONG).show();
                break;
            case R.id.textview_1:
                Toast.makeText(ButtonActivity.this,"TextView 被点击了", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}