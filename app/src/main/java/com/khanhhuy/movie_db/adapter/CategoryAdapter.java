package com.khanhhuy.movie_db.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khanhhuy.movie_db.BR;
import com.khanhhuy.movie_db.R;
import com.khanhhuy.movie_db.databinding.ItemListFragmentHomeBinding;
import com.khanhhuy.movie_db.model.CategoryList;
import java.util.List;

/**
 * Created by yeu_thuong on 11/5/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<String> mCategoryNames;

    public CategoryAdapter(List<String> categoryNames){
        mCategoryNames = categoryNames;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_fragment_home, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.bindData(mCategoryNames.get(position));
    }

    @Override
    public int getItemCount() {
        return mCategoryNames == null? 0 : mCategoryNames.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{
        private ItemListFragmentHomeBinding mBinding;

        public CategoryViewHolder(View view){
            super(view);
            mBinding = DataBindingUtil.bind(view);
        }

        public void bindData(String categoryName){
            mBinding.setVariable(BR.categoryName, categoryName);
        }
    }
}
