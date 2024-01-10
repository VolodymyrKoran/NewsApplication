package com.example.newsapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import android.content.Context;

import java.util.ArrayList;

/**
 * RecyclerView Adapter for displaying a list of news articles.
 */
public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ViewHolder> {

    /**
     * The list of articles to be displayed in the RecyclerView.
     */
    private ArrayList<Articles> articlesArrayList;

    /**
     * The context associated with the adapter.
     */
    private Context context;


    /**
     * Constructs a new NewsRVAdapter with the given list of articles and context.
     *
     * @param articlesArrayList The list of articles to be displayed.
     * @param context           The context associated with the adapter.
     */
    public NewsRVAdapter(ArrayList<Articles> articlesArrayList, Context context) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
    }


    /**
     * Called when RecyclerView needs a new ViewHolder of the given type to represent
     * an item.
     *
     * @param parent   The ViewGroup into which the new View will be added.
     * @param viewType The view type of the new View.
     * @return A new ViewHolder that holds a View of the given view type.
     */
    @NonNull
    @Override
    public NewsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_rv_item,parent,false);
        return new NewsRVAdapter.ViewHolder(view);
    }


    /**
     * Called by RecyclerView to display the data at the specified position.
     *
     * @param holder   The ViewHolder that should be updated to represent the contents of the item at the given position.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Articles articles = articlesArrayList.get(position);
        holder.subTitleTV.setText(articles.getDescription());
        holder.titleTV.setText(articles.getTitle());
        Picasso.get().load(articles.getUrlToImage()).into(holder.newsIV);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,NewsDeatilActivity.class);
                i.putExtra("title", articles.getTitle());
                i.putExtra("content", articles.getContent());
                i.putExtra("desc", articles.getDescription());
                i.putExtra("image", articles.getUrlToImage());
                i.putExtra("url", articles.getUrl());
                context.startActivity(i);
            }
        });
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in the data set.
     */
    @Override
    public int getItemCount() {
        return articlesArrayList.size();
    }

    /**
     * ViewHolder class for holding the views of each item in the RecyclerView.
     */
    public class ViewHolder extends RecyclerView.ViewHolder{

        /**
         * TextView for displaying the title of the news article.
         * TextView for displaying the subtitle/description of the news article.
         */
        private TextView titleTV,subTitleTV;

        /**
         * ImageView for displaying the image associated with the news article.
         */
        private ImageView newsIV;


        /**
         * Constructs a new ViewHolder with the given View.
         *
         * @param itemView The View associated with the ViewHolder.
         */
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.idIVNewsHeading);
            subTitleTV = itemView.findViewById(R.id.idTVSubTitle);
            newsIV = itemView.findViewById(R.id.idIVNews);

        }
    }
}
