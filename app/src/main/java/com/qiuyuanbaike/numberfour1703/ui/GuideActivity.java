package com.qiuyuanbaike.numberfour1703.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.qiuyuanbaike.numberfour1703.R;
import com.qiuyuanbaike.numberfour1703.adapter.FragmetAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends FragmentActivity {
    private ViewPager viewPager;


@BindView(R.id.indicator)
CirclePageIndicator indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

        initialViewPager();

    }

    private void initialViewPager() {
        viewPager = (ViewPager) findViewById(R.id.viewPagerId);
        FragmetAdapter adapter = new FragmetAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        indicator.setViewPager(viewPager);

        final float density=getResources().getDisplayMetrics().density;
//        indicator.setBackgroundColor(0xFFCCCCCC);//背景颜色
        indicator.setRadius(5*density);
        indicator.setPageColor(Color.WHITE);
        indicator.setFillColor(Color.RED);
        indicator.setStrokeColor(Color.BLACK);
        indicator.setStrokeWidth(2*density);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==3){
                    indicator.setVisibility(View.INVISIBLE);
                }else{
                    indicator.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
