package com.example.ivancrnogorac.execomsaleapp.generic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Ivan Crnogorac on 5/16/2017.
 */

public abstract class RecyclerViewAdapterBase <T, V extends View> extends RecyclerView.Adapter<ViewWrapper<V>> {

    protected final Context context;

    protected final List<T> items;

    public RecyclerViewAdapterBase(Context context, List<T> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public final ViewWrapper<V> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewWrapper<V>(onCreateItemView(parent, viewType));
    }

    protected abstract V onCreateItemView(ViewGroup parent, int viewType);

    // additional methods to manipulate the items
}