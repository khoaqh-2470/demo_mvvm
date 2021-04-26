package com.example.demomvvm.databinding;
import com.example.demomvvm.R;
import com.example.demomvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFoodsBindingImpl extends ItemFoodsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFoodsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemFoodsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageView.setTag(null);
        this.relativeOnClickListener.setTag(null);
        this.textViewName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.food == variableId) {
            setFood((com.example.demomvvm.data.models.Food) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFood(@Nullable com.example.demomvvm.data.models.Food Food) {
        this.mFood = Food;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.food);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.demomvvm.data.models.Food food = mFood;
        java.lang.String foodThumbnail = null;
        int foodId = 0;
        java.lang.String foodTitle = null;
        java.lang.String foodTitleFoodId = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (food != null) {
                    // read food.thumbnail
                    foodThumbnail = food.getThumbnail();
                    // read food.id
                    foodId = food.getId();
                    // read food.title
                    foodTitle = food.getTitle();
                }


                // read (food.title) + (food.id)
                foodTitleFoodId = (foodTitle) + (foodId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.demomvvm.utils.BindingAdaptersKt.loadImage(this.imageView, foodThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewName, foodTitleFoodId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): food
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}