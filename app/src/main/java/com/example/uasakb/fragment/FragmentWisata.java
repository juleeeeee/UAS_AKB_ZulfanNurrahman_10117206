package com.example.uasakb.fragment;

// 11 Agustus 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.uasakb.R;

public class FragmentWisata extends Fragment {

    public FragmentWisata() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wisata, container, false);
    }
}
