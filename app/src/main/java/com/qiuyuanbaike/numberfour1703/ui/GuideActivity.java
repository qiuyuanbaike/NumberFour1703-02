package com.qiuyuanbaike.numberfour1703.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.qiuyuanbaike.numberfour1703.R;
import com.qiuyuanbaike.numberfour1703.adapter.FragmetAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;

public class GuideActivity extends FragmentActivity {
    private ViewPager viewPager;


@BindView(R.id.indicator)
    CirclePageIndicator indicaror;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initialViewPager();

    }

    private void initialViewPager() {
        viewPager = (ViewPager) findViewById(R.id.viewPagerId);
        FragmetAdapter adapter = new FragmetAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        indicaror.setViewPager(viewPager);

        final float density=getResources().getDisplayMetrics().density;
        indicaror.setBackgroundColor(0xFFCCCCCC);
        indicaror.setRadius(10*density);
        indicaror.setPageColor(0x880000FF);
        indicaror.setStrokeColor(0xFF000000);
        indicaror.setStrokeWidth(2*density);

    }
}
