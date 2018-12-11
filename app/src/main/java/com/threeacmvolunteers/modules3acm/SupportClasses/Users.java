package com.threeacmvolunteers.modules3acm.SupportClasses;

public class Users {
    String id,type;

    public Users(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
