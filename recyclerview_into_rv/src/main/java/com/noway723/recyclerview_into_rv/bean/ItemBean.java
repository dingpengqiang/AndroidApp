package com.noway723.recyclerview_into_rv.bean;

import android.text.TextUtils;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：ItemBean
 */
public class ItemBean implements MultiItemEntity {


    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;
    public static final int TYPE_4 = 4;
    public static final int TYPE_5 = 5;
    public static final int TYPE_6 = 6;
    public static final int TYPE_7 = 7;


    private int itemType ;


    public List<OneBean> list1;
    public List<OneBean> list2;
    public List<OneBean> list3;
    public List<OneBean> list4;
    public List<OneBean> list5;
    public List<OneBean> list6;
    public List<OneBean> list7;


    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
