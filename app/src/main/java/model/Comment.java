package model;

import java.sql.Date;

public class Comment {
    private String id_user, comment;
    private Date comment_time;

    public Comment() {
        this.id_user = "";
        this.comment = "";
        this.comment_time = new Date(System.currentTimeMillis());;
    }

    public Comment(String id_user, String comment, Date comment_time) {
        this.id_user = id_user;
        this.comment = comment;
        this.comment_time = comment_time;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }
}
