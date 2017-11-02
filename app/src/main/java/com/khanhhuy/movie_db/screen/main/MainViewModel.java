package com.khanhhuy.movie_db.screen.main;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.khanhhuy.movie_db.adapter.ViewPagerAdapter;
import com.khanhhuy.movie_db.databinding.ActivityMainBinding;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public class MainViewModel extends BaseObservable implements MainContract.ViewModel {

    private MainContract.Presenter mPresenter;
    private MainActivity mMainActivity;

    public MainViewModel(MainActivity mainActivity, MainContract.Presenter presenter){
        mMainActivity = mainActivity;
        mPresenter = presenter;
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public ViewPagerAdapter getAdapter(){
        return new ViewPagerAdapter(mMainActivity, mMainActivity.getSupportFragmentManager());
    }

}
