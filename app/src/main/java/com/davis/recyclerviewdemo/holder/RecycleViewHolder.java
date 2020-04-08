package com.davis.recyclerviewdemo.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.davis.recyclerviewdemo.R;

/**
 * Created by Administrator on 2019/4/15.
 */

public class RecycleViewHolder extends RecyclerView.ViewHolder {

    private TextView txt_title, txt_info;
    private ImageView img_title;
    public RecycleViewHolder(View view){
        super(view);
        txt_title = (TextView)view.findViewById(R.id.txt_title);
        txt_info = (TextView)view.findViewById(R.id.txt_info);
        img_title = (ImageView)view.findViewById(R.id.img_title);
    }

    public TextView getTxt_info(){
        return this.txt_info;
    }

    public ImageView getImg(){
        return this.img_title;
    }

    public TextView getTxt_title(){
        return txt_title;
    }
}
