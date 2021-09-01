package com.example.greenomy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //네비게이션 생성하기 위한
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private fragment_home fg_home = new fragment_home();
    private fragment_community fg_community = new fragment_community();
    private fragment_store fg_store = new fragment_store();
    private fragment_my fg_my = new fragment_my();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationBarView bottom = findViewById(R.id.bottom_nav);

        //첫화면띄우기
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_frame, fg_home).commitAllowingStateLoss();

        bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, fg_home).commit();
                        break;
                    case R.id.menu_store:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, fg_store).commit();
                        break;
                    case R.id.menu_my:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, fg_my).commit();
                        break;
                    case R.id.menu_commu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, fg_community).commit();
                        break;
                }
                return true;
            }
        });
    }
}