package com.qiuyuanbaike.numberfour1703.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qiuyuanbaike.numberfour1703.fragment.FragmentFour;
import com.qiuyuanbaike.numberfour1703.fragment.FragmentOne;
import com.qiuyuanbaike.numberfour1703.fragment.FragmentThree;
import com.qiuyuanbaike.numberfour1703.fragment.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class FragmetAdapter  extends FragmentPagerAdapter {

        //创建一个集合
        private List<Fragment> fragments=new ArrayList<Fragment>();

        public FragmetAdapter(FragmentManager fm) {
            super(fm);
            fragments.add(new FragmentOne());
            fragments.add(new FragmentTwo());
            fragments.add(new FragmentThree());
            fragments.add(new FragmentFour());
        }

//    //往集合里面添加数据
//        public void addFragments(Fragment fragment){
//            if (fragment!=null){
//                fragments.add(fragment);
//                //通知View更
//                //新页面
//                notifyDataSetChanged();
//            }
//        }
        //从集合中获取一个适配项
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }
        //计算适配的元素的长度
        @Override
        public int getCount() {
            return fragments.size();
        }
    }


