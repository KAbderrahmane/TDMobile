package com.example.abderrahmene.myapplication;

/**
 * Created by Abderrahmene on 25/02/2016.
 */
public class Book {

    private  String title;
    private  int cover;

    public Book(String title, int cover) {
        this.title = title;
        this.cover = cover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getTitle() {

        return title;
    }

    public int getCover() {
        return cover;
    }
}
