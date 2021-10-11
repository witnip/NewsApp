package com.witnip.newsapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.witnip.newsapp.fragments.EntertainmentFragment;
import com.witnip.newsapp.fragments.HealthFragment;
import com.witnip.newsapp.fragments.HomeFragment;
import com.witnip.newsapp.fragments.ScienceFragment;
import com.witnip.newsapp.fragments.SportsFragment;
import com.witnip.newsapp.fragments.TechnologyFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new EntertainmentFragment();
            case 5:
                return new TechnologyFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
