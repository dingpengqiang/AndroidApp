package com.noway723.douyin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：MainFragment
 */
public class MainFragment extends Fragment {

    private View mRootView;
    private RecyclerView recyclerView;

    private MainActivity activity;
    private TextView takePhoto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_main, container, false);
        return mRootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) activity = (MainActivity) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        takePhoto = mRootView.findViewById(R.id.txt_take_photo);
        recyclerView = mRootView.findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new MyLinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        final MainAdapter adapter = new MainAdapter(R.layout.item, null);
        recyclerView.setAdapter(adapter);


        ArrayList<ItemBean> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ItemBean itemBean = new ItemBean();
            data.add(itemBean);
        }
        adapter.setNewData(data);

        adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                activity.mViewPager.setCurrentItem(2);
            }
        });

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.mViewPager.setCurrentItem(0);
            }
        });
    }
}
