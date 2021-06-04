package com.example.tendy_hermansyah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DailyActivity extends Fragment {
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
        View view = inflater.inflate(R.layout.activity_daily, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_list);
        Adapter adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


//        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerview_horizontal);
        com.example.tendy_hermansyah.Adapter2 adapter2 = new com.example.tendy_hermansyah.Adapter2();
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL);

        recyclerView2.setLayoutManager(horizontalLayoutManager);

        return view;
    }
}