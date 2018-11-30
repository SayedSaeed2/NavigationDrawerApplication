package com.example.android.myndapplication.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.myndapplication.R;
import com.example.android.myndapplication.adapter.UserAdapter;
import com.example.android.myndapplication.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRecycler1 extends Fragment {

    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> userList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userList = new ArrayList<>();
        User user1 = new User(R.drawable.user1, "User 1");
        User user2 = new User(R.drawable.user2, "User 2");
        User user3 = new User(R.drawable.user3, "User 3");
        User user4 = new User(R.drawable.user1, "User 4");
        User user5 = new User(R.drawable.user2, "User 5");
        User user6 = new User(R.drawable.user3, "User 6");
        User user7 = new User(R.drawable.user2, "User 7");
        User user8 = new User(R.drawable.user1, "User 8");
        User user9 = new User(R.drawable.user3, "User 9");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_recycler, container, false);

        recyclerView = view.findViewById(R.id.recycler1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new UserAdapter(getActivity(), userList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
