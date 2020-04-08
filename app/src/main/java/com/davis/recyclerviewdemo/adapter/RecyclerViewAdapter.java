package com.davis.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davis.recyclerviewdemo.R;
import com.davis.recyclerviewdemo.bean.MenuBean;
import com.davis.recyclerviewdemo.callback.OnRecyclerItemClickListener;
import com.davis.recyclerviewdemo.holder.RecycleViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/14.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    public List<MenuBean> mDatas = new ArrayList<MenuBean>();
    private Context mContext;
    private OnRecyclerItemClickListener listener;

    public RecyclerViewAdapter(Context context, List<MenuBean> datas){
        this.mContext = context;
        this.mDatas = datas;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleViewHolder holder = new RecycleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_view, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, final int position) {
        holder.getTxt_title().setText(mDatas.get(position).getTxt_title());
        holder.getTxt_info().setText(mDatas.get(position).getTxt_info());
        holder.getImg().setImageResource(mDatas.get(position).getImg_title());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //第二步， 写一个公共的方法
    public void setOnItemClickListener(OnRecyclerItemClickListener listener) {
        this.listener = listener;
    }
}
