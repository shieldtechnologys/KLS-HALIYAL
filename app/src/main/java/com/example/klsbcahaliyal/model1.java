package com.example.klsbcahaliyal;

public class model1 {
    String Dis,Urls,Title;


    public model1() {

    }

    public model1(String dis, String urls,String title) {
        Dis = dis;
        Urls = urls;
        Title = title;

    }

    public String getDis() {
        return Dis;
    }

    public void setDis(String dis) {
        Dis = dis;
    }

    public String getUrls() {
        return Urls;
    }

    public void setUrls(String urls) {
        Urls = urls;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

}
