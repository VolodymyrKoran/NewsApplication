package com.example.newsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * RecyclerView Adapter for displaying categories in a RecyclerView.
 */
public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder> {

    /**
     * List of CategoryRVModal objects representing the data for the adapter.
     */
    private ArrayList<CategoryRVModal>  categoryRVModals;

    /**
     * Context associated with the adapter.
     */
    private Context context;

    /**
     * Interface for handling category click events.
     */
    private CategorClickInterface categorClickInterface;


    /**
     * Constructor to initialize the CategoryRVAdapter.
     *
     * @param categoryRVModals       List of CategoryRVModal objects.
     * @param context                Context associated with the adapter.
     * @param categorClickInterface Interface for handling category click events.
     */
    public CategoryRVAdapter(ArrayList<CategoryRVModal> categoryRVModals, Context context, CategorClickInterface categorClickInterface) {
        this.categoryRVModals = categoryRVModals;
        this.context = context;
        this.categorClickInterface = categorClickInterface;
    }


    /**
     * Inflates the layout for each item view in the RecyclerView.
     *
     * @param parent   The ViewGroup into which the new View will be added.
     * @param viewType The type of the new View.
     * @return A new ViewHolder that holds a View of the given view type.
     */
    @NonNull
    @Override
    public CategoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_rv_item,parent,false);
        return new CategoryRVAdapter.ViewHolder(view);
    }


    /**
     * Binds the data to the views in each item view.
     *
     * @param holder   The ViewHolder that should be updated to represent the contents of the item at the given position.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull CategoryRVAdapter.ViewHolder holder, int position) {
        CategoryRVModal categoryRVModal = categoryRVModals.get(position);
        holder.categoryTV.setText(categoryRVModal.getCategory());
        Picasso.get().load(categoryRVModal.getCategoryImageUrl()).into(holder.categoryIV);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categorClickInterface.onCategoryClick(position);

            }
        });
    }


    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {

        return categoryRVModals.size();
    }

    /**
     * Interface definition for a callback to be invoked when a category is clicked.
     */
    public interface CategorClickInterface{
        /**
         * Called when a category is clicked.
         *
         * @param position The position of the clicked category in the adapter.
         */
        void onCategoryClick(int position);
    }

    /**
     * ViewHolder class representing the views in each item view of the RecyclerView.
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        /**
         * TextView for displaying the category name.
         */
        private TextView categoryTV;

        /**
         * ImageView for displaying the category image.
         */
        private ImageView categoryIV;


        /**
         * Constructor to initialize the ViewHolder.
         *
         * @param itemView The root view of the ViewHolder.
         */
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            categoryTV = itemView.findViewById(R.id.idTVCategory);
            categoryIV = itemView.findViewById(R.id.idIVCategory);

        }
    }
}
