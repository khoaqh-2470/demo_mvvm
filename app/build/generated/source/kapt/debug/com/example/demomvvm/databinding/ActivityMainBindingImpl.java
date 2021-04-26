package com.example.demomvvm.databinding;
import com.example.demomvvm.R;
import com.example.demomvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progressBar, 3);
        sViewsWithIds.put(R.id.textError, 4);
    }
    // views
    // variables
    // values
    // listeners
    private LoadMoreRecyclerViewListenerImpl mViewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.recyclerViewFoods.setTag(null);
        this.swipeRefresh.setTag(null);
        this.textLoadMore.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainAdapter == variableId) {
            setMainAdapter((com.example.demomvvm.ui.main.MainAdapter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.demomvvm.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainAdapter(@Nullable com.example.demomvvm.ui.main.MainAdapter MainAdapter) {
        this.mMainAdapter = MainAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mainAdapter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.demomvvm.ui.main.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.demomvvm.utils.LoadMoreRecyclerViewListener viewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        int viewModelIsLoadingViewGONEViewGONE = 0;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        com.example.demomvvm.ui.main.MainAdapter mainAdapter = mMainAdapter;
        com.example.demomvvm.ui.main.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel::onLoadData
                    viewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener = (((mViewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener == null) ? (mViewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener = new LoadMoreRecyclerViewListenerImpl()) : mViewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener).setValue(viewModel));
                    // read viewModel.isLoading()
                    viewModelIsLoading = viewModel.isLoading();
                }
                updateLiveDataRegistration(0, viewModelIsLoading);


                if (viewModelIsLoading != null) {
                    // read viewModel.isLoading().getValue()
                    viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.GONE
                viewModelIsLoadingViewGONEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.example.demomvvm.utils.BindingAdaptersKt.setAdapter(this.recyclerViewFoods, mainAdapter);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.demomvvm.utils.BindingAdaptersKt.onScrollListener(this.recyclerViewFoods, androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue, (com.example.demomvvm.utils.LoadMoreRecyclerViewListener)viewModelOnLoadDataComExampleDemomvvmUtilsLoadMoreRecyclerViewListener);
            this.textLoadMore.setVisibility(viewModelIsLoadingViewGONEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class LoadMoreRecyclerViewListenerImpl implements com.example.demomvvm.utils.LoadMoreRecyclerViewListener{
        private com.example.demomvvm.ui.main.MainViewModel value;
        public LoadMoreRecyclerViewListenerImpl setValue(com.example.demomvvm.ui.main.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onLoadData() {
            this.value.onLoadData(); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading()
        flag 1 (0x2L): mainAdapter
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.GONE : View.GONE
    flag mapping end*/
    //end
}