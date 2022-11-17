package com.esprit.guideme.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Cafes")
public class Cafe {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "cafe_name")
    private String cafeName;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "start_hour")
    private int startHour;
    @ColumnInfo(name = "end_hour")
    private int endHour;
    @ColumnInfo(name = "menu")
    private String menu;
    @ColumnInfo(name = "phone")
    private String phone;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "link_facebook")
    private String linkFacebook;
    @ColumnInfo(name = "link_instagram")
    private String linkInstagram;

    public Cafe() {

    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @NonNull
    @Override
    public String toString() {
        return "Cafe{" +
                "cafeName='" + cafeName + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", menu='" + menu + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", linkFacebook='" + linkFacebook + '\'' +
                ", linkInstagram='" + linkInstagram + '\'' +
                '}';
    }

    public Cafe(int uid, String cafeName, String description, String address, int startHour, int endHour, String menu, String phone, String email, String linkFacebook, String linkInstagram) {
        this.uid = uid;
        this.cafeName = cafeName;
        this.description = description;
        this.address = address;
        this.startHour = startHour;
        this.endHour = endHour;
        this.menu = menu;
        this.phone = phone;
        this.email = email;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
    }


}
