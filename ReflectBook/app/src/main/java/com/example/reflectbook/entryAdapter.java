package com.example.reflectbook;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class entryAdapter extends RecyclerView.Adapter<entryAdapter.EntryViewHolder> {
    private ArrayList<entry_item> mEntryList;

    public static class EntryViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView entry_num_textView;
        public TextView date_textView;

        public EntryViewHolder(View itemView){
            super(itemView);
            mImageView = itemView.findViewById(R.id.img_recyclerView);
            entry_num_textView = itemView.findViewById(R.id.Entry_num_recyclerview);
            date_textView = itemView.findViewById(R.id.date_recyclerview);
        }
    }

    public entryAdapter(ArrayList<entry_item> entry_list){
        mEntryList = entry_list;
    }

    @NonNull
    @Override
    public entryAdapter.EntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.entry_item,parent,false);
        EntryViewHolder evh = new EntryViewHolder(v);
        return new EntryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull entryAdapter.EntryViewHolder holder, int position) {
        entry_item currentItem = mEntryList.get(position);

        holder.mImageView.setImageResource(currentItem.getImgResource());
        holder.entry_num_textView.setText(currentItem.getEntry_num());
        holder.date_textView.setText(currentItem.getDateofEntry());
    }

    @Override
    public int getItemCount() {
        return mEntryList.size();
    }
}
