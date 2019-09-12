package com.noway723.douyin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：LeftFragment
 */
public class LeftFragment extends Fragment {


    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_left, container, false);
        return mRootView;
    }
}
