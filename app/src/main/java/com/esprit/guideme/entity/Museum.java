package com.esprit.guideme.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Museums")
public class Museum {
    @PrimaryKey(autoGenerate = true)
    private int Mid;

    @ColumnInfo(name = "name")
    private String museumName;
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "start_hour")
    private int startHour;
    @ColumnInfo(name = "end_hour")
    private int endHour;
    @ColumnInfo(name = "gallery")
    private String gallery;
    @ColumnInfo(name = "phone")
    private String phone;
    @ColumnInfo(name = "facebook_link")
    private String linkFacebook;
    @ColumnInfo(name = "instagram_link")
    private String linkInstagram;


    public int getMid() {
        return Mid;
    }

    public void setMid(int mid) {
        Mid = mid;
    }

    public String getMuseumName() {
        return museumName;
    }

    public void setMuseumName(String museumName) {
        this.museumName = museumName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public Museum(int mid, String museumName, String address, int startHour, int endHour, String gallery, String phone, String linkFacebook, String linkInstagram) {
        Mid = mid;
        this.museumName = museumName;
        this.address = address;
        this.startHour = startHour;
        this.endHour = endHour;
        this.gallery = gallery;
        this.phone = phone;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "Mid=" + Mid +
                ", museumName='" + museumName + '\'' +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", gallery='" + gallery + '\'' +
                ", phone='" + phone + '\'' +
                ", linkFacebook='" + linkFacebook + '\'' +
                ", linkInstagram='" + linkInstagram + '\'' +
                '}';
    }
}
