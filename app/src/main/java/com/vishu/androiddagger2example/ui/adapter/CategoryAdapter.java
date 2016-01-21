package com.vishu.androiddagger2example.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vishu.androiddagger2example.R;
import com.vishu.androiddagger2example.data.model.CategoryDetails;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Vishal on 28-12-2015.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{
    private static mClickListener listener;
    ArrayList<CategoryDetails> categoryList = new ArrayList<CategoryDetails>();

    public CategoryAdapter(ArrayList<CategoryDetails> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.category_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CategoryDetails currentCategoryInfo = categoryList.get(position);
        holder.catName.setText(currentCategoryInfo.getName());
    }

    public void setListner(mClickListener listner) {
        this.listener = listner;
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @Bind(R.id.category_name)
        TextView catName;
        @Bind(R.id.category_image)
        ImageView catImage;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.mClick(view, this.getLayoutPosition());
        }
    }

    public interface mClickListener {
        public void mClick(View v, int position);
    }
}
