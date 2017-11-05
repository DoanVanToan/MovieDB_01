package com.khanhhuy.movie_db.screen.main.home;

import com.khanhhuy.movie_db.screen.BasePresenter;
import com.khanhhuy.movie_db.screen.BaseViewModel;
import com.khanhhuy.movie_db.screen.main.MainContract;

/**
 * Created by yeu_thuong on 11/5/2017.
 */

public interface HomeContact {

    interface ViewModel extends BaseViewModel<HomeContact.Presenter> {
    }

    interface Presenter extends BasePresenter {
    }
}
