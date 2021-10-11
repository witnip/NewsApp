package com.witnip.newsapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.witnip.newsapp.R;
import com.witnip.newsapp.WebViewActivity;
import com.witnip.newsapp.databinding.NewsItemBinding;
import com.witnip.newsapp.models.ArticlesItem;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context mContext;
    ArrayList<ArticlesItem> articles;

    public Adapter(Context mContext, ArrayList<ArticlesItem> articles) {
        this.mContext = mContext;
        this.articles = articles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.news_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ArticlesItem article = articles.get(position);

        holder.binding.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, WebViewActivity.class);
            intent.putExtra("url",article.getUrl());
            mContext.startActivity(intent);
        });

        holder.binding.mainHeading.setText(article.getTitle());
        holder.binding.contentHeading.setText(article.getDescription());
        Glide.with(mContext).load(article.getUrlToImage()).into(holder.binding.mainImage);
        holder.binding.author.setText(String.format("By %s", article.getAuthor()));
        holder.binding.time.setText(String.format("Publised At: %s", article.getPublishedAt()));
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        NewsItemBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = NewsItemBinding.bind(itemView);
        }
    }
}
