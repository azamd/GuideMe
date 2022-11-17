package com.esprit.guideme.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Restos")
public class Resto {
    @PrimaryKey(autoGenerate = true)
    private int RestId;

    @ColumnInfo(name = "name")
    private String restoName;
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

    public int getRestId() {
        return RestId;
    }

    public void setRestId(int restId) {
        RestId = restId;
    }

    public String getRestoName() {
        return restoName;
    }

    public void setRestoName(String restoName) {
        this.restoName = restoName;
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

    public Resto(int restId, String restoName, String address, int startHour, int endHour, String menu, String phone, String linkFacebook, String linkInstagram) {
        RestId = restId;
        this.restoName = restoName;
        this.address = address;
        this.startHour = startHour;
        this.endHour = endHour;
        this.menu = menu;
        this.phone = phone;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
    }

    @Override
    public String toString() {
        return "Resto{" +
                "RestId=" + RestId +
                ", restoName='" + restoName + '\'' +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", menu='" + menu + '\'' +
                ", phone='" + phone + '\'' +
                ", linkFacebook='" + linkFacebook + '\'' +
                ", linkInstagram='" + linkInstagram + '\'' +
                '}';
    }
}
