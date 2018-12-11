package com.threeacmvolunteers.modules3acm.SupportClasses;

public class Feedback {
    String userid,reason,message,date,time;

    public Feedback(String userid, String reason, String message, String date, String time) {
        this.userid = userid;
        this.reason = reason;
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public String getUserid() {
        return userid;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
