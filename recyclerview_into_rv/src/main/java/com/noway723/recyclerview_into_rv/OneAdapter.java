package com.noway723.recyclerview_into_rv;

import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.noway723.recyclerview_into_rv.bean.ItemBean;
import com.noway723.recyclerview_into_rv.bean.OneBean;

import java.util.List;

/**
 * @author NoWay723
 * 版本：V-1.0
 * 创建日期：${DATA}
 * 描述：OneAdapter
 */
public class OneAdapter extends BaseQuickAdapter<OneBean, BaseViewHolder> {


    public OneAdapter(int layoutResId, @Nullable List<OneBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final OneBean item) {




    }
}
