package com.khanhhuy.movie_db.screen.main.home;

/**
 * Created by yeu_thuong on 11/5/2017.
 */

public class HomePresenter implements HomeContact.Presenter {
    private HomeContact.ViewModel mViewModel;

    public HomePresenter(HomeContact.ViewModel mViewModel) {
        mViewModel = mViewModel;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}
