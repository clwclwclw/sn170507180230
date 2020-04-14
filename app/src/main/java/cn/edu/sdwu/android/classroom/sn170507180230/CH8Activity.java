package cn.edu.sdwu.android.classroom.sn170507180230;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class CH8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch8_1);
        //使用编码方式实现布局
        FrameLayout frameLayout=new FrameLayout(this);
        //参数代表宽和高
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        ImageView imageView=new ImageView(this);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setImageResource(R.drawable.img);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(imageView);//添加到frameLayout

        TextView textView=new TextView(this);
        textView.setText("test");
        textView.setTextColor(Color.RED);
        textView.setTextSize(70);
        textView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        frameLayout.addView(textView);
        setContentView(frameLayout);
    }
}