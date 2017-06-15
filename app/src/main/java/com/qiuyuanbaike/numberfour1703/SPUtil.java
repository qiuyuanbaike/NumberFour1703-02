package com.qiuyuanbaike.numberfour1703;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.qiuyuanbaike.numberfour1703.constant.Constant;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class SPUtil {
    SharedPreferences sp;

    public SPUtil(Context context, String name) {
        sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);

    }

    public SPUtil(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);

    }

    public boolean isFirst() {
        return sp.getBoolean(Constant.FLRST, true);

    }

    public void setFirst(boolean flag) {
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(Constant.FLRST, flag);
        edit.commit();

    }
}
