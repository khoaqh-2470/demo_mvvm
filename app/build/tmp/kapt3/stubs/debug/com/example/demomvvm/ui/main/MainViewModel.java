package com.example.demomvvm.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u00100\u00150\u0010J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/demomvvm/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/example/demomvvm/utils/LoadMoreRecyclerViewListener;", "mainRepository", "Lcom/example/demomvvm/data/reponsitory/MainRepository;", "(Lcom/example/demomvvm/data/reponsitory/MainRepository;)V", "_foods", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/demomvvm/data/models/Food;", "_isLoading", "", "countItem", "", "foodAll", "foods", "Landroidx/lifecycle/LiveData;", "getFoods", "()Landroidx/lifecycle/LiveData;", "isLoading", "loadAllFoods", "Lcom/example/demomvvm/utils/Resource;", "onLoadData", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel implements com.example.demomvvm.utils.LoadMoreRecyclerViewListener {
    private java.util.List<com.example.demomvvm.data.models.Food> foodAll;
    private int countItem = 5;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.demomvvm.data.models.Food>> _foods = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final com.example.demomvvm.data.reponsitory.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.demomvvm.data.models.Food>> getFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.demomvvm.utils.Resource<androidx.lifecycle.LiveData<java.util.List<com.example.demomvvm.data.models.Food>>>> loadAllFoods() {
        return null;
    }
    
    @java.lang.Override()
    public void onLoadData() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.reponsitory.MainRepository mainRepository) {
        super();
    }
}