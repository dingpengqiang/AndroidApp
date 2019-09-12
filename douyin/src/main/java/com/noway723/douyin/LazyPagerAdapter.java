package com.noway723.douyin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：LazyPagerAdapter
 */
//public class LazyPagerAdapter extends FragmentPagerAdapter {
//    private List<FragmentCreator> list;
//    private FragmentManager mFragmentManager;
//
//    public void setFragments(List<FragmentCreator> list) {
//        FragmentTransaction transaction = mFragmentManager.beginTransaction();
//        for (Fragment f : mFragmentManager.getFragments()) {
//            transaction.remove(f);
//        }
//        transaction.commitNow();
//        this.list = list;
//        notifyDataSetChanged();
//    }
//
//
//    public LazyPagerAdapter(FragmentManager fm, List<FragmentCreator> list) {
//        super(fm);
//        this.list = list;
//        mFragmentManager = fm;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        FragmentCreator fragmentCreator = list.get(position);
//        return fragmentCreator.createFragment();
//    }
//
//    @Override
//    public int getItemPosition(Object object) {
//        return POSITION_NONE;
//    }
//
//    @Override
//    public int getCount() {
//        return list.size();
//    }
//}
