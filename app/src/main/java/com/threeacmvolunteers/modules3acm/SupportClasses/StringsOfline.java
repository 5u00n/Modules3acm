package com.threeacmvolunteers.modules3acm.SupportClasses;

public class StringsOfline {
    String id,name,discription,date,time,url,type,seen,offlineurl;

    public StringsOfline() {
    }

    public StringsOfline(String id, String name, String discription, String date, String time, String url, String type, String seen, String offlineurl) {
        this.id = id;
        this.name = name;
        this.discription = discription;
        this.date = date;
        this.time = time;
        this.url = url;
        this.type = type;
        this.seen = seen;
        this.offlineurl = offlineurl;

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

    public String getSeen() {
        return seen;
    }

    public String getOfflineurl() {
        return offlineurl;
    }
}
