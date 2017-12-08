package com.wk.listtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 78560 on 2017/11/20.
 */

public class RecycleviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder  holder = null;
        if(ONE_ITEM == viewType){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_title_item,parent,false);
            holder = new OneViewHolder(v);
        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_details_item,parent,false);
            holder = new TwoViewHolder(v);
        }
        return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        if(position % 3 == 0){
            return ONE_ITEM ;
        }else{
            return TWO_ITEM;
        }
    }

    @Override
    public int getItemCount() {
        return 9;
    }
    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class OneViewHolder extends RecyclerView.ViewHolder {
        public OneViewHolder(View view){
            super(view);
        }
    }
    public static class TwoViewHolder extends RecyclerView.ViewHolder {
        public TwoViewHolder(View view){
            super(view);
        }
    }
}
