package com.threeacmvolunteers.modules3acm.SupportClasses;

public class Strings {
    String id,name,discription,date,time,url,type;

    public Strings() {
    }

    public Strings(String id, String name, String discription, String date, String time, String url, String type) {
        this.id = id;
        this.name = name;
        this.discription = discription;
        this.date = date;
        this.time = time;
        this.url = url;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getDiscription() {
        return discription;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}
