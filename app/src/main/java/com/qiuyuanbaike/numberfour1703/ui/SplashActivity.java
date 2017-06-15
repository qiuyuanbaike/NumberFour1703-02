package com.qiuyuanbaike.numberfour1703.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.qiuyuanbaike.numberfour1703.R;
import com.qiuyuanbaike.numberfour1703.SPUtil;

public class SplashActivity extends AppCompatActivity {

    SPUtil spUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        MyHander();
        spUtil=new SPUtil(this);

    }

    public void MyHander() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                if (true){
                 intent=new Intent(SplashActivity.this, GuideActivity.class);
                    spUtil.setFirst(false);
                }else {
                    intent=new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
