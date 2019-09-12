package com.noway723.douyin;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    public ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mViewPager = findViewById(R.id.viewpager);


        ArrayList<Fragment> list = new ArrayList<>();

        LeftFragment leftFragment = new LeftFragment();
        RightFragment rightFragment = new RightFragment();
        MainFragment mainFragment = new MainFragment();

        list.add(leftFragment);
        list.add(mainFragment);
        list.add(rightFragment);


        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), list);
        mViewPager.setAdapter(adapter);

        mViewPager.setCurrentItem(1);

    }
}
