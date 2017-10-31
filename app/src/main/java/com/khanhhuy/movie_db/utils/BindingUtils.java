package com.khanhhuy.movie_db.utils;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.khanhhuy.movie_db.adapter.ViewPagerAdapter;

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
}
