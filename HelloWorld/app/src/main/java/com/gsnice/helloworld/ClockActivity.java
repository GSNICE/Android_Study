package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ClockActivity extends AppCompatActivity implements View.OnClickListener,Chronometer.OnChronometerTickListener,DatePicker.OnDateChangedListener,TimePicker.OnTimeChangedListener{

    private Chronometer chronometer;
    private Button btn_start,btn_stop,btn_base,btn_format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        initView();
    }

    private void initView() {
        chronometer = findViewById(R.id.chronometer);
        btn_start = findViewById(R.id.btnStart);
        btn_stop = findViewById(R.id.btnStop);
        btn_base = findViewById(R.id.btnReset);
        btn_format = findViewById(R.id.btn_format);

        chronometer.setOnChronometerTickListener(this);
        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
        btn_base.setOnClickListener(this);
        btn_format.setOnClickListener(this);

//        DatePicker dp_test = findViewById(R.id.dp_test);
//        Calendar calendar = Calendar.getInstance();
//        int year=calendar.get(Calendar.YEAR);
//        int monthOfYear=calendar.get(Calendar.MONTH);
//        int dayOfMonth=calendar.get(Calendar.DAY_OF_MONTH);
//        dp_test.init(year,monthOfYear,dayOfMonth,this);

        TimePicker tp_test = (TimePicker) findViewById(R.id.tp_test);
        tp_test.setOnTimeChangedListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnStart:
                chronometer.start();// 开始计时
                break;
            case R.id.btnStop:
                chronometer.stop();// 停止计时
                break;
            case R.id.btnReset:
                chronometer.setBase(SystemClock.elapsedRealtime());// 复位
                break;
            case R.id.btn_format:
                chronometer.setFormat("Time：%s");// 更改时间显示格式
                break;
        }
    }

    @Override
    public void onChronometerTick(Chronometer chronometer) {
        String time = chronometer.getText().toString();
        if(time.equals("00:00")){
            Toast.makeText(ClockActivity.this,"时间到了~",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
        Toast.makeText(ClockActivity.this,"您选择的日期是："+i+"年"+(i1+1)+"月"+i2+"日!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTimeChanged(TimePicker timePicker, int i, int i1) {
        Toast.makeText(ClockActivity.this,"您选择的时间是："+i+"时"+i1+"分!",Toast.LENGTH_SHORT).show();
    }
}