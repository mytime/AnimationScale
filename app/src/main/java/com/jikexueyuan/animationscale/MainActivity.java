package com.jikexueyuan.animationscale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;

/**
 * ScaleAnimation 缩放动画效果
 */
public class MainActivity extends AppCompatActivity {

    //缩放对象
    private ScaleAnimation sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //从左上角向右下角缩放
//        sa = new ScaleAnimation(0,1,0,1);
        //相对于自生的50%位置来缩放
        sa = new ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_SELF,0.5f);
        //持续时间
        sa.setDuration(1000);

        //查找
        findViewById(R.id.btnScale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //方法一
//                v.startAnimation(sa);

                //方法二，使用xml方式
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.sa));
            }
        });
    }
}
