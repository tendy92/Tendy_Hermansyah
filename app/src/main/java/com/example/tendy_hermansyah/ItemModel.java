package com.example.tendy_hermansyah;

public class ItemModel {
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
