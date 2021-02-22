package model;

import java.sql.Date;

public class User {

    private String id, nama, username, email, password, profileImage, telepon;
    private Date dob;

    public User(){
        this.id = "";
        this.nama = "";
        this.username = "";
        this.email = "";
        this.password = "";
        this.profileImage = "";
        this.telepon = "";
        this.dob = new Date(System.currentTimeMillis());
    }

    public User(String id, String nama, String username, String email, String password, String profileImage, String telepon, Date dob) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profileImage = profileImage;
        this.telepon = telepon;
        this.dob = dob;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
