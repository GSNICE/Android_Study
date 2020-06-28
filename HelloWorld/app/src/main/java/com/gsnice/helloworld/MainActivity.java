package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_TextView;
    private Button button_Button;
    private Button button_EditText;
    private Button button_RadioButton;
    private Button button_CheckBox;
    private Button button_ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  TextView
        button_TextView = findViewById(R.id.button_Textview);

        //  Button
        button_Button = findViewById(R.id.button_Button);

        //  EditText
        button_EditText = findViewById(R.id.button_EditText);

        //  RadioButton
        button_RadioButton = findViewById(R.id.button_RadioButton);

        //  CheckBox
        button_CheckBox = findViewById(R.id.button_CheckBox);

        //  ImageView
        button_ImageView = findViewById(R.id.button_ImageView);

        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        button_Button.setOnClickListener(onClick);
        button_TextView.setOnClickListener(onClick);
        button_EditText.setOnClickListener(onClick);
        button_RadioButton.setOnClickListener(onClick);
        button_CheckBox.setOnClickListener(onClick);
        button_ImageView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.button_Button:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.button_EditText:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case  R.id.button_Textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case  R.id.button_RadioButton:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case  R.id.button_CheckBox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.button_ImageView:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}