package com.khanhhuy.movie_db.screen.main.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khanhhuy.movie_db.R;
import com.khanhhuy.movie_db.screen.BaseFragment;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public class FragmentHome extends BaseFragment{

    public static FragmentHome newInstance(){
        FragmentHome fragment = new FragmentHome();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
