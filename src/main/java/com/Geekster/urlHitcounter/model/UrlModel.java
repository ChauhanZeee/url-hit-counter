package com.Geekster.urlHitcounter.model;

public class UrlModel {
    private int count;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UrlModel(int count) {
        this.count = count;
    }

    public UrlModel(int count, String username) {
        this.count = count;
        this.username = username;
    }

    @Override
    public String toString() {
        return "UrlModel{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "UrlModel{" +
//                "count=" + count +
//                '}';
//    }
}
