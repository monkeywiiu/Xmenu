package com.example.xmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.zmenu.PUtils;
import com.example.zmenu.SnakeButtonLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public SnakeButtonLayout container;
    public List<Integer> imageList;
    public List<Integer> colorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initImages();
        //设置图片和颜色
        PUtils.getInstance().setImagesAndColors(imageList, colorList);

        //设置悬浮按钮的margin
        PUtils.getInstance().setMargin((int) getResources().getDimension(R.dimen.margin));
        setContentView(R.layout.activity_main);
        container = (SnakeButtonLayout) findViewById(R.id.container);
        container.setIsClickable(true);
        container.setOnTopViewClickListener(new SnakeButtonLayout.onTopViewClickListener() {
            @Override
            public void onclick() {
                Toast.makeText(MainActivity.this, "你点击了导航栏", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initImages() {
        imageList = new ArrayList<>();
        colorList = new ArrayList<>();
        imageList.add(R.drawable.image1);
        imageList.add(R.drawable.image2);
        imageList.add(R.drawable.image3);
        imageList.add(R.drawable.image4);
        imageList.add(R.drawable.image5);
        imageList.add(R.drawable.image6);

        colorList.add(R.color.background1);
        colorList.add(R.color.background2);
        colorList.add(R.color.background3);
        colorList.add(R.color.background4);
        colorList.add(R.color.background5);
        colorList.add(R.color.background6);
    }
}
