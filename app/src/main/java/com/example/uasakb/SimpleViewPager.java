package com.example.uasakb;

// 10 Agustus 2020 ~ 10117206 Zulfan Nurrahman IF7

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.uasakb.fragment.FragmentProfile;
import com.example.uasakb.fragment.FragmentWisata;

public class SimpleViewPager extends FragmentStatePagerAdapter {

    public SimpleViewPager(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FragmentProfile();
            case 1 : return new FragmentWisata();
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 : return "Profile";
            case 1 : return "Wisata";
            default : return "no";
        }
    }
}
