package com.khanhhuy.movie_db.screen.main;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.ViewModel mViewModel;

    public MainPresenter(MainContract.ViewModel mViewModel) {
        mViewModel = mViewModel;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}
