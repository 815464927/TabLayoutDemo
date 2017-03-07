package com.song.tablayoutdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.song.tablayoutdemo.fragments.TabFragment;

/**
 * Created by song on 2017/3/7.
 * Email：815464927@qq.com
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private static String[] mTabs;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        mTabs = new String[]{"tablayout1","tablayout2","tablayout3","tablayout4","tablayout5"};
    }

    @Override
    public Fragment getItem(int position) {
        return new TabFragment();
    }

    @Override
    public int getCount() {
        return mTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs[position];
    }

}
