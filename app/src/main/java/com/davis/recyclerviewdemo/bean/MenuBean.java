package com.davis.recyclerviewdemo.bean;

public class MenuBean {

    private String txt_title;
    private String txt_info;
    private int img_title;

    public MenuBean() {
    }

    public MenuBean(String txt_title, String txt_info, int img_title) {
        this.txt_title = txt_title;
        this.txt_info = txt_info;
        this.img_title = img_title;
    }

    public String getTxt_title() {
        return txt_title;
    }

    public void setTxt_title(String txt_title) {
        this.txt_title = txt_title;
    }

    public String getTxt_info() {
        return txt_info;
    }

    public void setTxt_info(String txt_info) {
        this.txt_info = txt_info;
    }

    public int getImg_title() {
        return img_title;
    }

    public void setImg_title(int img_title) {
        this.img_title = img_title;
    }
}
