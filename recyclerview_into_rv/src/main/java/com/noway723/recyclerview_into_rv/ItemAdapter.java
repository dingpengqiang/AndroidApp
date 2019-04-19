package com.noway723.recyclerview_into_rv;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.noway723.recyclerview_into_rv.bean.ItemBean;

import java.util.List;


/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：ItemAdapter
 */
public class ItemAdapter extends BaseMultiItemQuickAdapter<ItemBean, BaseViewHolder> {


    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public ItemAdapter(List<ItemBean> data) {
        super(data);

        addItemType(ItemBean.TYPE_1,R.layout.item1);
        addItemType(ItemBean.TYPE_2,R.layout.item2);
        addItemType(ItemBean.TYPE_3,R.layout.item3);
        addItemType(ItemBean.TYPE_4,R.layout.item4);
        addItemType(ItemBean.TYPE_5,R.layout.item5);
        addItemType(ItemBean.TYPE_6,R.layout.item6);
        addItemType(ItemBean.TYPE_7,R.layout.item7);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemBean item) {

        switch (helper.getItemViewType()){
            case ItemBean.TYPE_1:
                buildLayout1(helper,item);
                break;
            case ItemBean.TYPE_2:
                buildLayout2(helper,item);
                break;
            case ItemBean.TYPE_3:
                buildLayout3(helper,item);
                break;
            case ItemBean.TYPE_4:
                buildLayout4(helper,item);
                break;
            case ItemBean.TYPE_5:
                buildLayout5(helper,item);
                break;
            case ItemBean.TYPE_6:
                buildLayout6(helper,item);
                break;
            case ItemBean.TYPE_7:
                buildLayout7(helper,item);
                break;
        }

    }

    private void buildLayout7(BaseViewHolder helper, ItemBean item) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        RecyclerView recyclerview = helper.getView(R.id.item7_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item7, item.list7);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout6(BaseViewHolder helper, ItemBean item) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        RecyclerView recyclerview = helper.getView(R.id.item6_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item6, item.list6);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout5(BaseViewHolder helper, ItemBean item) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        RecyclerView recyclerview = helper.getView(R.id.item5_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item5, item.list5);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout4(BaseViewHolder helper, ItemBean item) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        RecyclerView recyclerview = helper.getView(R.id.item4_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item4, item.list4);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout3(BaseViewHolder helper, ItemBean item) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        RecyclerView recyclerview = helper.getView(R.id.item3_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item3, item.list3);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout2(BaseViewHolder helper, ItemBean item) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        RecyclerView recyclerview = helper.getView(R.id.item2_rv);

        recyclerview.setLayoutManager(layoutManager);
        OneAdapter adapter = new OneAdapter(R.layout.child_item2, item.list2);
        recyclerview.setAdapter(adapter);

    }

    private void buildLayout1(BaseViewHolder helper, ItemBean item) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        RecyclerView recyclerview = helper.getView(R.id.item1_rv);

        recyclerview.setLayoutManager(layoutManager);

        OneAdapter adapter = new OneAdapter(R.layout.child_item1, item.list1);
        recyclerview.setAdapter(adapter);
    }
}
