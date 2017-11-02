package com.khanhhuy.movie_db.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.khanhhuy.movie_db.R;
import com.khanhhuy.movie_db.screen.main.favorite.FragmentFavorite;
import com.khanhhuy.movie_db.screen.main.home.FragmentHome;

/**
 * Created by yeu_thuong on 10/31/2017.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private static final int NUMBER_OF_TABS = 2;
    private static final int HOME = 0;
    private static final int FAVORITE = 1;
    private Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case HOME:
                return FragmentHome.newInstance();
            case FAVORITE:
                return FragmentFavorite.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case HOME:
                return mContext.getString(R.string.tab_home);
            case FAVORITE:
                return mContext.getString(R.string.tab_favorite);
            default:
                return null;
        }
    }

}
