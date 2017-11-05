package com.khanhhuy.movie_db.screen.main.home;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.khanhhuy.movie_db.adapter.CategoryAdapter;
import com.khanhhuy.movie_db.model.CategoryList;
import com.khanhhuy.movie_db.screen.main.MainActivity;
import com.khanhhuy.movie_db.screen.main.MainContract;

import java.util.List;

/**
 * Created by yeu_thuong on 11/5/2017.
 */

public class HomeViewModel extends BaseObservable implements HomeContact.ViewModel {

    private HomeContact.Presenter mPresenter;
    private FragmentHome mFragmentHome;

    public HomeViewModel(FragmentHome fragmentHome, HomeContact.Presenter presenter){
        mFragmentHome = fragmentHome;
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
    public void setPresenter(HomeContact.Presenter presenter) {
        mPresenter = presenter;
    }

    public CategoryAdapter getAdapter(){
        return new CategoryAdapter(CategoryList.CATEGORY_NAME);
    }
}
