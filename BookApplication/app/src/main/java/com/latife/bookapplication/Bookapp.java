package com.latife.bookapplication;

import java.io.Serializable;

public class Bookapp implements Serializable {
    String name;
    String review;
    int image;

    public Bookapp(String name, String review, int image) {
        this.name = name;
        this.review = review;
        this.image = image;
    }
}
