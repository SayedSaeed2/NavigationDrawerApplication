package com.example.android.myndapplication.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.myndapplication.R;
import com.example.android.myndapplication.adapter.TabAdapter;

public class MainFragmentTab extends Fragment {

    private TabAdapter adapter;
    private TabLayout tableLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabs, container, false);

        viewPager = view.findViewById(R.id.request_orders_view_pager);
        tableLayout = view.findViewById(R.id.request_orders_tabs);

        adapter = new TabAdapter(getFragmentManager());
        adapter.addFragment(new UserRecycler1(), "Tab 1");
        adapter.addFragment(new UserRecycler1(), "Tab 2");
        adapter.addFragment(new UserRecycler1(), "Tab 3");

        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);

        return view;
    }
}
