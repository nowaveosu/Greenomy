package com.example.greenomy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationBarView;

public class fragment_community extends Fragment {
    private child_fg_photo fg_photo = new child_fg_photo();
    private child_fg_confirm fg_confirm = new child_fg_confirm();
    private child_fg_infor fg_infor = new child_fg_infor();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_community, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentManager fragmentManager = getChildFragmentManager();

        NavigationBarView nav = view.findViewById(R.id.commu_nav);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.commu_fragment_frame, fg_photo).commitAllowingStateLoss();

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_photo:
                        getChildFragmentManager().beginTransaction().replace(R.id.commu_fragment_frame, fg_photo).commit();
                        break;
                    case R.id.menu_confirm:
                        getChildFragmentManager().beginTransaction().replace(R.id.commu_fragment_frame, fg_confirm).commit();
                        break;
                    case R.id.menu_infor:
                        getChildFragmentManager().beginTransaction().replace(R.id.commu_fragment_frame, fg_infor).commit();
                        break;

                }
                return true;
            }
        });
    }
}
