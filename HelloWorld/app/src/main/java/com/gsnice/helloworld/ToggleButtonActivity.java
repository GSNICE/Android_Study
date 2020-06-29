package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private ToggleButton toggleButton_1;
    private Switch switch_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        toggleButton_1 = findViewById(R.id.tb_1);
        switch_1 = findViewById(R.id.switch_1);

        toggleButton_1.setOnCheckedChangeListener(this);
        switch_1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.tb_1: {
                if(compoundButton.isChecked()) {
                    Toast.makeText(this, "ToggleButton 开关:ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this,"ToggleButton 开关:OFF",Toast.LENGTH_SHORT).show();
                }
            }
                break;
            case R.id.switch_1: {
                if(!compoundButton.isChecked()) {
                    Toast.makeText(this,"Switch 开关:OFF",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Switch 开关:ON", Toast.LENGTH_SHORT).show();
                }
            }
                break;
        }
    }
}
