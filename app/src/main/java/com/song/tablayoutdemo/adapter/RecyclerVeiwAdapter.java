package com.song.tablayoutdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.song.tablayoutdemo.R;

import java.util.ArrayList;

/**
 * Created by song on 2017/3/7.
 * Email：815464927@qq.com
 */

public class RecyclerVeiwAdapter extends RecyclerView.Adapter<RecyclerVeiwAdapter.RecyclerViewHolder>{
    private Context mContext;
    private ArrayList<String> mData;

    public RecyclerVeiwAdapter(Context mContext, ArrayList<String> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolder view = new RecyclerViewHolder(
                LayoutInflater.from(mContext).inflate(R.layout.recycler_item,parent,false));

        return view;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView tv;

        public RecyclerViewHolder(View view){
            super(view);
            tv = (TextView) view.findViewById(R.id.item_tv);
        }
    }
}
