package com.song.tablayoutdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.song.tablayoutdemo.R;
import com.song.tablayoutdemo.adapter.RecyclerVeiwAdapter;

import java.util.ArrayList;

/**
 * Created by song on 2017/3/7.
 * Email：815464927@qq.com
 */

public class TabFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private RecyclerVeiwAdapter mRecyclerAdapter;
    private ArrayList<String> mData = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab,container,false);
        initData(view);
        return view;
    }

    private void initData(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayout.VERTICAL);
        mRecyclerView.setLayoutManager(manager);

        for (int i=0;i<20;i++){
            mData.add("item data "+i);
        }
        mRecyclerAdapter = new RecyclerVeiwAdapter(getActivity(),mData);
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }

    @Override
    protected void loadData() {
        mRecyclerAdapter.notifyDataSetChanged();
    }
}
