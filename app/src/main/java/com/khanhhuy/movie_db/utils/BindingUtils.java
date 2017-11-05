package com.khanhhuy.movie_db.utils;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.khanhhuy.movie_db.adapter.ViewPagerAdapter;
import com.khanhhuy.movie_db.adapter.CategoryAdapter;

/**
 * Created by yeu_thuong on 11/2/2017.
 */

public final class BindingUtils {

    @BindingAdapter("bindViewPager")
    public static void bindTabLayout(final TabLayout tabLayout, final ViewPager viewpager){
        tabLayout.setupWithViewPager(viewpager);
    }

    @BindingAdapter("bindAdapter")
    public static void bindViewPager(final ViewPager viewPager, ViewPagerAdapter adapter){
        viewPager.setAdapter(adapter);
    }

    @BindingAdapter("bindRecyclerAdapter")
    public static void bindFragmentHome(final RecyclerView recyclerView, RecyclerView.Adapter adapter){
        recyclerView.setAdapter(adapter);;
    }

}
