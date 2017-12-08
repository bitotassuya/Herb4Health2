package com.example.asus.herb4health.Model;

/**
 * Created by Non on 12/4/2017.
 */

public class Food {
    public String title,summary,url;
    public int img;

    public Food(String title,String summary,int img){

        this.title = title;
        this.summary = summary;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
