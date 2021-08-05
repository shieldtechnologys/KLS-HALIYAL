package com.example.klsbcahaliyal;

public class sem5model {

    String title, fileurl;
    int year;

    public sem5model() {

    }

    public sem5model(String title, String fileurl, int year) {
        this.title = title;
        this.fileurl = fileurl;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
