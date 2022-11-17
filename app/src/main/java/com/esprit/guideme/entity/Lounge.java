package com.esprit.guideme.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Lounges")
public class Lounge {
    @PrimaryKey(autoGenerate = true)
    private int lid;

    @ColumnInfo(name = "name")
    private String loungeName;
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
    @ColumnInfo(name = "facebook_link")
    private String linkFacebook;
    @ColumnInfo(name = "instagram_link")
    private String linkInstagram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLoungeName() {
        return loungeName;
    }

    public void setLoungeName(String loungeName) {
        this.loungeName = loungeName;
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

    public Lounge(int lid, String loungeName, String address, int startHour, int endHour, String menu, String phone, String linkFacebook, String linkInstagram) {
        this.lid = lid;
        this.loungeName = loungeName;
        this.address = address;
        this.startHour = startHour;
        this.endHour = endHour;
        this.menu = menu;
        this.phone = phone;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
    }

    @NonNull
    @Override
    public String toString() {
        return "Lounge{" +
                ", loungeName='" + loungeName + '\'' +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", menu='" + menu + '\'' +
                ", phone='" + phone + '\'' +
                ", linkFacebook='" + linkFacebook + '\'' +
                ", linkInstagram='" + linkInstagram + '\'' +
                '}';
    }

    public Lounge() {
    }
}
