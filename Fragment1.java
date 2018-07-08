package com.example.user.nav3;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Fragment1 extends Fragment {
    Context context;
    private RecyclerView mRecyclerview;
    public String[] str = {"Temperature", "Weight", "Length","Speed","Currency","Volume","Time","Area","Fuel","pressure","Energy","Storage","luminance","Current","Force","Sound","Frequency","Image"};
    public int[] img = {R.drawable.len, R.drawable.temperature, R.drawable.wei,R.drawable.len, R.drawable.temperature, R.drawable.wei,R.drawable.len, R.drawable.temperature, R.drawable.wei,R.drawable.len, R.drawable.temperature, R.drawable.wei,R.drawable.len, R.drawable.temperature, R.drawable.wei,R.drawable.len, R.drawable.temperature, R.drawable.wei};
    private List<items> itemsList;
    public Fragment1() {
        // Required empty public constructor
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         context = getActivity().getApplicationContext();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.recyclecontent1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerview = (RecyclerView) getActivity().findViewById(R.id.recycler_view1);
        AdapterOne Adapter1 = new AdapterOne();
       // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerview.setLayoutManager(LayoutManager);
        mRecyclerview.setAdapter(Adapter1);
        mRecyclerview.setHasFixedSize(true);

        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
       // mRecyclerview.setLayoutManager(mLayoutManager);
        prepareMovieData();
//        prepareMovieData();
        Adapter1.notifyDataSetChanged();
    }
        private void prepareMovieData() {
        for (int i = 0; i < str.length; i++) {
            items items = new items();
            items.setStr(str[i]);
            items.setIn(img[i]);
            itemsList.add(items);


        }
    }
}
