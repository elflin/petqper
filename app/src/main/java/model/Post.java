package model;

import java.sql.Date;
import java.util.ArrayList;

public class Post {
    private String id_post, id_user, image, caption;
    private Date posting_time;
    private ArrayList<Like> likes;
    private ArrayList<Comment> comments;

    public Post() {
        this.id_post = "";
        this.id_user = "";
        this.image = "";
        this.caption = "";
        this.posting_time = new Date(System.currentTimeMillis());;
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public Post(String id_post, String id_user, String image, String caption, Date posting_time, ArrayList<Like> likes, ArrayList<Comment> comments) {
        this.id_post = id_post;
        this.id_user = id_user;
        this.image = image;
        this.caption = caption;
        this.posting_time = posting_time;
        this.likes = likes;
        this.comments = comments;
    }
}
