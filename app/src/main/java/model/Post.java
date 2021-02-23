package model;

import java.sql.Date;
import java.util.ArrayList;

public class Post {
    private String id_post, id_user, image, caption;
    private Date posting_time;
//    private ArrayList<Like> likes;
//    private ArrayList<Comment> comments;

    public Post() {
        this.id_post = "";
        this.id_user = "";
        this.image = "";
        this.caption = "";
        this.posting_time = new Date(System.currentTimeMillis());;
//        this.likes = new ArrayList<>();
//        this.comments = new ArrayList<>();
    }

    public Post(String id_post, String id_user, String image, String caption, Date posting_time) {
        this.id_post = id_post;
        this.id_user = id_user;
        this.image = image;
        this.caption = caption;
        this.posting_time = posting_time;
//        this.likes = likes;
//        this.comments = comments;
    }

    public String getId_post() {
        return id_post;
    }

    public void setId_post(String id_post) {
        this.id_post = id_post;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getPosting_time() {
        return posting_time;
    }

    public void setPosting_time(Date posting_time) {
        this.posting_time = posting_time;
    }
}
