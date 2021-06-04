package com.example.tendy_hermansyah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Gallery extends Fragment {
    /*
        NIM                 : 10118083
        Nama                : Tendy Hermansyah
        Kelas               : IF2
        Matakuliah          : Aplikasi Komputasi Bergerak
        Tanggal pengerjaan  : 04 Juni 2021
        */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_gallery, container, false);
        return view;
    }

    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

//        data.add(new LocalImages(R.drawable.wall_0));
        data.add(new LocalImages(R.drawable.kopi));
        data.add(new LocalImages(R.drawable.kopi2));
//        data.add(new LocalImages(R.drawable.wall_1));
//        data.add(new LocalImages(R.drawable.wall_2));
//        data.add(new LocalImages(R.drawable.wall_3));
//            data.add(new LocalImages(R.drawable.jawabanone));


        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        LocalImagesAdapter adapter = new LocalImagesAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}