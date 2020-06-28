package com.gsnice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView_3 = findViewById(R.id.iv_3);
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593330626757&di=056ecfe0a2bc8597777f446b50c47851&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Ffront%2F311%2Fw668h443%2F20181226%2FBKzI-hqtwzec9181755.png").into(imageView_3);
    }
}