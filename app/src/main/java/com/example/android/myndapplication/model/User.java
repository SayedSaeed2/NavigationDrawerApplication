package com.example.android.myndapplication.model;

public class User {

    private int image;
    private String userName;


    public User() {
    }

    public User(int image, String userName) {
        this.image = image;
        this.userName = userName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
