package com.khanhhuy.movie_db.screen.main;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.khanhhuy.movie_db.screen.BasePresenter;
import com.khanhhuy.movie_db.screen.BaseViewModel;

import java.util.List;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public interface MainContract {

    interface ViewModel extends BaseViewModel<Presenter>{
    }

    interface Presenter extends BasePresenter {
    }
}
