package com.example.tendy_hermansyah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MusicVideo extends Fragment {
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
        View view = inflater.inflate(R.layout.activity_music_video, container, false);
        return view;
    }
}