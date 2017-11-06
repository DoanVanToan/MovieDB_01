package com.khanhhuy.movie_db.screen.main.home;

import android.databinding.BaseObservable;

import com.khanhhuy.movie_db.adapter.CategoryAdapter;
import com.khanhhuy.movie_db.model.CategoryList;

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
