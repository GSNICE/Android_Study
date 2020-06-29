package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    private ListView listView_1;
    private String[] data = {
            "ButtonActivity", "CheckBoxActivity", "EditTextActivity", "ImageViewActivity", "RadioButtonActivity", "ScrollViewActivity",
            "SeekBarActivity", "TextViewActivity", "ToggleButtonActivity"
    };
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, data);
        listView_1 = findViewById(R.id.listView_1);
        listView_1.setAdapter(adapter);

        listView_1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(ListViewActivity.this,"点击了第"+ i + "个 Item",Toast.LENGTH_SHORT).show();
        switch (i) {
            case 0:
                intent = new Intent(ListViewActivity.this,ButtonActivity.class);
                break;
            case 1:
                intent = new Intent(ListViewActivity.this,CheckBoxActivity.class);
                break;
            case 2:
                intent = new Intent(ListViewActivity.this,EditTextActivity.class);
                break;
            case 3:
                intent = new Intent(ListViewActivity.this,ImageViewActivity.class);
                break;
            case 4:
                intent = new Intent(ListViewActivity.this,RadioButtonActivity.class);
                break;
            case 5:
                intent = new Intent(ListViewActivity.this,ScrollViewActivity.class);
                break;
            case 6:
                intent = new Intent(ListViewActivity.this,SeekBarActivity.class);
                break;
            case 7:
                intent = new Intent(ListViewActivity.this,TextViewActivity.class);
                break;
            case 8:
                intent = new Intent(ListViewActivity.this,ToggleButtonActivity.class);
                break;
        }
        startActivity(intent);

    }
}