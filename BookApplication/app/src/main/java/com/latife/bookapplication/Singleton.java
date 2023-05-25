package com.latife.bookapplication;

public class Singleton {

    private Bookapp sentBook;
    private static Singleton singleton;

    private Singleton(){

    }

    public Bookapp getSentBook(){
        return sentBook;

    }

    public void setSentBook(Bookapp sentBook){
        this.sentBook=sentBook;
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }


}
