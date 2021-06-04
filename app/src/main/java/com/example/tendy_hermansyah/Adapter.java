package com.example.tendy_hermansyah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter{
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() { return Ourdata.hari_daily.length; }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText, mItemText1, mItemText2, mItemText3, mItemText4, mItemText5;
        public ImageView mItemImage, mItemImage1, mItemImage2, mItemImage3, mItemImage4, mItemImage5;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.daftar_bangun);
            mItemText1 = (TextView) itemView.findViewById(R.id.daftar_mandi);
            mItemText2 = (TextView) itemView.findViewById(R.id.daftar_makan);
            mItemText3 = (TextView) itemView.findViewById(R.id.daftar_kerja);
            mItemText4 = (TextView) itemView.findViewById(R.id.daftar_mandi2);
            mItemText5 = (TextView) itemView.findViewById(R.id.daftar_tidur);
            mItemImage = (ImageView) itemView.findViewById(R.id.ic_bangun);
            mItemImage1 = (ImageView) itemView.findViewById(R.id.ic_mandi);
            mItemImage2 = (ImageView) itemView.findViewById(R.id.ic_eat);
            mItemImage3 = (ImageView) itemView.findViewById(R.id.ic_work);
            mItemImage4 = (ImageView) itemView.findViewById(R.id.ic_mandi2);
            mItemImage5 = (ImageView) itemView.findViewById(R.id.ic_sleep);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(Ourdata.hari_daily[position]);
            mItemImage.setImageResource(Ourdata.dailyPicturePath[position]);


        }



        @Override
        public void onClick(View v) {

        }
    }
}
