package com.noway723.douyin;

import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;
import java.util.Random;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：MainAdapter
 */
public class MainAdapter extends BaseQuickAdapter<ItemBean, BaseViewHolder> {
    public MainAdapter(int layoutResId, @Nullable List<ItemBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemBean item) {


//随机生成颜色
        Random mRandom = new Random();
        int ranColor = 0xff000000 | mRandom.nextInt(0x00ffffff);
// 随机颜色  
        Random random = new Random();
        int[] ranColor2 = {0xff000000, 0x00ff00ff, 0xff000000, 0x00ffff00, 0x00ffffff, 0x00ff0000}; //0xff000000 | random.nextInt(0x00ffffff);


        helper.addOnClickListener(R.id.img_user);
        helper.setBackgroundColor(R.id.frame_layout, ranColor);


    }
}
