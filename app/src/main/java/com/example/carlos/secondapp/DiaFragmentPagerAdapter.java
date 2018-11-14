package com.example.carlos.secondapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DiaFragmentPagerAdapter extends FragmentPagerAdapter {
    public DiaFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new DiaFragment().newInstance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "ALBUNES";

            case 1:
                return "GENEROS";
            case 2:
                return "ARTISTAS";
            case 3:
                return "PISTAS";


        }

        return super.getPageTitle(position);
    }
}
