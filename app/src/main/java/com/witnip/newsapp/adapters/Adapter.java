package com.witnip.newsapp.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.witnip.newsapp.databinding.NewsItemBinding;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        NewsItemBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = NewsItemBinding.bind(itemView);
        }
    }
}