package com.khanhhuy.movie_db.model;

import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.View;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yeu_thuong on 11/6/2017.
 */

public class CategoryList {
    public static final List<String> CATEGORY_NAME = new ArrayList<String>(
            Arrays.asList(new String[]{"Popular", "Now playing", "Upcoming", "Top rate"}));
}

