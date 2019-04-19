package com.noway723.recyclerview_into_rv;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.noway723.recyclerview_into_rv.bean.ItemBean;
import com.noway723.recyclerview_into_rv.bean.OneBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);


        adapter = new ItemAdapter(null);
        recyclerView.setAdapter(adapter);


        ArrayList<ItemBean> list = new ArrayList<>();


        ArrayList<OneBean> beanlist1 = new ArrayList<>();
        ArrayList<OneBean> beanlist2 = new ArrayList<>();
        ArrayList<OneBean> beanlist3 = new ArrayList<>();
        ArrayList<OneBean> beanlist4 = new ArrayList<>();
        ArrayList<OneBean> beanlist5 = new ArrayList<>();
        ArrayList<OneBean> beanlist6 = new ArrayList<>();
        ArrayList<OneBean> beanlist7 = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(1);
            OneBean oneBean = new OneBean();
            beanlist1.add(oneBean);

            itemBean.list1 = beanlist1;
            list.add(itemBean);
        }
        for (int i = 0; i < 1; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(2);
            OneBean oneBean = new OneBean();
            beanlist2.add(oneBean);


            itemBean.list2 = beanlist2;
            list.add(itemBean);

        }
        for (int i = 0; i < 2; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(3);
            OneBean oneBean = new OneBean();
            beanlist3.add(oneBean);


            itemBean.list3 = beanlist3;
            list.add(itemBean);

        }
        for (int i = 0; i < 3; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(4);
            OneBean oneBean = new OneBean();
            beanlist4.add(oneBean);


            itemBean.list4 = beanlist4;
            list.add(itemBean);
        }
        for (int i = 0; i < 6; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(5);
            OneBean oneBean = new OneBean();
            beanlist5.add(oneBean);


            itemBean.list5 = beanlist5;
            list.add(itemBean);
        }
        for (int i = 0; i < 1; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(6);
            OneBean oneBean = new OneBean();
            beanlist6.add(oneBean);


            itemBean.list6 = beanlist6;
            list.add(itemBean);
        }
        for (int i = 0; i < 3; i++) {
            ItemBean itemBean = new ItemBean();

            itemBean.setItemType(7);
            OneBean oneBean = new OneBean();
            beanlist7.add(oneBean);

            itemBean.list7 = beanlist7;
            list.add(itemBean);
        }

        adapter.setNewData(list);
    }
}
