package com.khanhhuy.movie_db.screen.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.khanhhuy.movie_db.R;
import com.khanhhuy.movie_db.databinding.ActivityMainBinding;
import com.khanhhuy.movie_db.screen.BaseActivity;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public class MainActivity extends BaseActivity {

    private MainContract.ViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainContract.Presenter presenter;
        presenter = new MainPresenter(mViewModel);
        mViewModel = new MainViewModel(this, presenter);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel((MainViewModel) mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }

}
