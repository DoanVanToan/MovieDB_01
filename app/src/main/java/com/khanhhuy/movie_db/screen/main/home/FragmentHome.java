package com.khanhhuy.movie_db.screen.main.home;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khanhhuy.movie_db.R;
import com.khanhhuy.movie_db.databinding.FragmentHomeBinding;
import com.khanhhuy.movie_db.screen.BaseFragment;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public class FragmentHome extends BaseFragment{
    private HomeContact.ViewModel mHomeViewModel;


    public static FragmentHome newInstance(){
        FragmentHome fragment = new FragmentHome();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeContact.Presenter presenter = new HomePresenter(mHomeViewModel);
        mHomeViewModel = new HomeViewModel(this, presenter);

        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container,false);
        binding.setViewModel((HomeViewModel) mHomeViewModel);
        return binding.getRoot();
    }

}
