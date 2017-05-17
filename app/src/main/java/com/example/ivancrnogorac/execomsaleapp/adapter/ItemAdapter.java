package com.example.ivancrnogorac.execomsaleapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ivancrnogorac.execomsaleapp.R;
import com.example.ivancrnogorac.execomsaleapp.model.Item;

import java.util.List;

/**
 * Created by Ivan Crnogorac on 5/17/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private Context context;
    private List<Item> itemList;


    //konstruktor
    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView itemTitle;
        public TextView itemUser;
        public ImageView thumbnail;

        public MyViewHolder (View view){
            super (view);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            itemTitle = (TextView) view.findViewById(R.id.title);
            itemUser = (TextView) view.findViewById(R.id.seller);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_item_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Item item = itemList.get(position);
        holder.itemTitle.setText(item.getItemName());
        //holder.itemUser.setText(item.getItemUser());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

}
