package com.example.algoji;

public class UserProfile {

    private String uid;
    private String photo_id;


    public UserProfile(String uid, String photo_id) {
        this.uid = uid;
        this.photo_id = photo_id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }
}
