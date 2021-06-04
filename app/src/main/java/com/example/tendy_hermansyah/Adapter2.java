package com.example.tendy_hermansyah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter2 extends RecyclerView.Adapter{
    /*
    NIM                 : 10118083
    Nama                : Tendy Hermansyah
    Kelas               : IF2
    Matakuliah          : Aplikasi Komputasi Bergerak
    Tanggal pengerjaan  : 04 Juni 2021
    */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_horizontal, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Ourdata.friendlist_daily.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;
        public ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.text_friend);
            mItemImage = (ImageView) itemView.findViewById(R.id.img_friend);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(Ourdata.friendlist_daily[position]);
            mItemImage.setImageResource(Ourdata.firendlistDailyPicturePath[position]);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
