package com.example.reflectbook;

public class entry_item {
    private int imgResource;
    private String entry_num;
    private String dateofEntry;

    public entry_item(int imgresource,String entry_NUM,String date){
        imgResource = imgresource;
        entry_num = entry_NUM;
        dateofEntry = date;
    }

    public int getImgResource() {
        return imgResource;
    }

    public String getEntry_num() {
        return entry_num;
    }

    public String getDateofEntry() {
        return dateofEntry;
    }
}
