package com.davis.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.davis.recyclerviewdemo.adapter.CommonDecoration;
import com.davis.recyclerviewdemo.adapter.RecyclerViewAdapter;
import com.davis.recyclerviewdemo.bean.MenuBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<MenuBean> listDatas = new ArrayList<MenuBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        recyclerView = (RecyclerView)findViewById(R.id.main_recycleview);
        loadMenuData();

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new CommonDecoration(this));

        adapter = new RecyclerViewAdapter(this, listDatas);
        recyclerView.setAdapter(adapter);
    }

    private void loadMenuData(){
        listDatas.add(new MenuBean("安检", "快速安检", R.mipmap.check_blue));
        listDatas.add(new MenuBean("行李", "提醒行李动态", R.mipmap.luggage_blue));
        listDatas.add(new MenuBean("餐饮", "提供航空 餐饮美食", R.mipmap.food_blue));
        listDatas.add(new MenuBean("VIP休息", "机场休息室", R.mipmap.vip_blue));
        listDatas.add(new MenuBean("机舱服务", "机舱上网 游戏娱乐", R.mipmap.service_blue));
        listDatas.add(new MenuBean("更多", "更多信息", R.mipmap.more_blue));
    }
}
