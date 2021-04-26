package com.example.demomvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"setData", "", "T", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Object;)V", "loadImage", "Landroid/widget/ImageView;", "url", "", "onScrollListener", "isLoading", "", "loadMoreListener", "Lcom/example/demomvvm/utils/LoadMoreRecyclerViewListener;", "setAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"bind:onLoadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bind:data"})
    public static final <T extends java.lang.Object>void setData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, T data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bind:adapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setAdapter, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bind:isLoading", "bind:onLoadMore"})
    public static final void onScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$onScrollListener, boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.example.demomvvm.utils.LoadMoreRecyclerViewListener loadMoreListener) {
    }
}