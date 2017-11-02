package com.khanhhuy.movie_db.screen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

/**
 * Created by yeu_thuong on 10/31/2017.
 */

public abstract class BaseRecyclerViewAdapter<V extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<V> {

    private final Context mContext;

    protected BaseRecyclerViewAdapter(@NonNull Context context) {
        mContext = context;
    }

    protected Context getContext() {
        return mContext;
    }

    /**
     * OnRecyclerViewItemClickListener
     *
     * @param <T> Data from item click
     */
    public interface OnRecyclerViewItemClickListener<T> {
        void onItemRecyclerViewClick(T item);
    }
}
