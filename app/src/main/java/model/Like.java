package model;

import java.sql.Date;

public class Like {
    private String id_user;
    private Date like_time;

    public Like() {
        this.id_user = "";
        this.like_time = new Date(System.currentTimeMillis());;
    }

    public Like(String id_user, Date like_time) {
        this.id_user = id_user;
        this.like_time = like_time;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public Date getLike_time() {
        return like_time;
    }

    public void setLike_time(Date like_time) {
        this.like_time = like_time;
    }
}
