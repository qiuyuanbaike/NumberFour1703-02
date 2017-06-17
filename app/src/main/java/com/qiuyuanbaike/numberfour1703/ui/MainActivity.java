package com.qiuyuanbaike.numberfour1703.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.qiuyuanbaike.numberfour1703.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pulltoer_main)
    PullToRefreshListView pandableListView;
    ArrayAdapter<String> adapter;
    ListView listView;
    List<String> datas;

    @BindView(R.id.city_latout)
    LinearLayout cityLayout;
    @BindView(R.id.city_text)
    TextView cityText;
    @BindView(R.id.add_text)
    TextView addText;

    @BindView(R.id.radioGroup)
    RadioGroup rg;

    @BindView(R.id.menuLaoyout)
    View menuLayout;

//    @BindView(R.id.item_viewPager)
    ViewPager viewPager;
//    @BindView(R.id.iv_header_list_icons_indicator1)
    ImageView imageView01;
//    @BindView(R.id.iv_header_list_icons_indicator2)
    ImageView imageView02;
//    @BindView(R.id.iv_header_list_icons_indicator3)
    ImageView imageView03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initListView();

    }

    private void initListView() {
        listView = pandableListView.getRefreshableView();
        datas = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);


        LayoutInflater inflater = LayoutInflater.from(this);
        final View viewPagerItemLayout = inflater.inflate(R.layout.viewpager_item, listView, false);
        View centreItemLayout = inflater.inflate(R.layout.centre_item, listView, false);
        View centreItemLayout02 = inflater.inflate(R.layout.item_02, listView, false);
        View centreItemLayout03 = inflater.inflate(R.layout.item_03, listView, false);
        View centreItemLayout04 = inflater.inflate(R.layout.item_04, listView, false);
        View centreItemLayout05 = inflater.inflate(R.layout.item_05, listView, false);
        listView.addHeaderView(viewPagerItemLayout);
        listView.addHeaderView(centreItemLayout02);
        listView.addHeaderView(centreItemLayout03);
        listView.addHeaderView(centreItemLayout04);
        listView.addHeaderView(centreItemLayout05);
        listView.addHeaderView(centreItemLayout);

        initLisHeaderlcons(viewPagerItemLayout);
        pandableListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        datas.add(0, "我是测试新增内容");
                        adapter.notifyDataSetChanged();
                        pandableListView.onRefreshComplete();


                    }
                }, 1000);
            }
        });
        viewPager = (ViewPager) findViewById(R.id.item_viewPager);
        imageView01 = (ImageView) findViewById(R.id.iv_header_list_icons_indicator1);
        imageView02 = (ImageView) findViewById(R.id.iv_header_list_icons_indicator2);
        imageView03 = (ImageView) findViewById(R.id.iv_header_list_icons_indicator3);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    @OnClick(R.id.add_text)
    public void toggleMenu(View view) {
        if (menuLayout.getVisibility() == View.VISIBLE) {
            menuLayout.setVisibility(View.INVISIBLE);
        } else {
            menuLayout.setVisibility(View.VISIBLE);
        }
    }

    private void initLisHeaderlcons(View viewPagerItemLayout) {
        final ViewPager viewPager = (ViewPager) viewPagerItemLayout.findViewById(R.id.item_viewPager);
        PagerAdapter adapter = new PagerAdapter() {
            int[] resIDs = new int[]{
                    R.layout.item_image_a,
                    R.layout.item_image_b,
                    R.layout.item_image_c
            };

            @Override
            public int getCount() {
                return 30000;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                int layoutId = resIDs[position % 3];
                View view = LayoutInflater.from(MainActivity.this).inflate(layoutId, viewPager, false);
                container.addView(view);
                return view;

            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }
        };
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(15000);
    }


    @Override
    protected void onResume() {
        super.onResume();
        refresh();
    }

    private void refresh() {
        datas.add("aaaa");
        datas.add("bbbb");
        datas.add("cccc");
        datas.add("dddd");
        datas.add("ffff");
        datas.add("eeee");
        datas.add("qqqq");
        datas.add("eeee");
        datas.add("wwww");
        datas.add("ssss");
        datas.add("gggg");
        datas.add("tttt");
        adapter.notifyDataSetChanged();
    }

}
