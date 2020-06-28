package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {

    private SeekBar seekBar_1;
    private TextView textView_1;
    private Context content_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        content_1 = SeekBarActivity.this;
        bindViews();
    }

    public void bindViews() {
        seekBar_1 = findViewById(R.id.SB_1);
        textView_1 = findViewById(R.id.SB_TV_1);

        seekBar_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView_1.setText("当前进度值:" + i + "  / 100 ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(content_1, "触碰SeekBar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(content_1, "放开SeekBar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}