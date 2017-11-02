package com.khanhhuy.movie_db.screen;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public interface BaseViewModel<T extends BasePresenter> {

    void onStart();

    void onStop();

    void setPresenter(T presenter);
}
