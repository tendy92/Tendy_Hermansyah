package com.example.tendy_hermansyah;

public class ItemModel {
    /*
        NIM                 : 10118083
        Nama                : Tendy Hermansyah
        Kelas               : IF2
        Matakuliah          : Aplikasi Komputasi Bergerak
        Tanggal pengerjaan  : 04 Juni 2021
        */
    private String name;
    private String type;
    private int image;

    public ItemModel(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }
}
