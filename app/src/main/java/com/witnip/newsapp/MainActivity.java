package com.witnip.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.witnip.newsapp.adapters.PagerAdapter;
import com.witnip.newsapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        adapter = new PagerAdapter(getSupportFragmentManager(),6);
        binding.container.setAdapter(adapter);

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.container.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0 ||
                tab.getPosition() == 1 ||
                tab.getPosition() == 2 ||
                tab.getPosition() == 3 ||
                tab.getPosition() == 4 ||
                tab.getPosition() == 5){
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        binding.container.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));
    }
}