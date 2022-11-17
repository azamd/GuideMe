package com.esprit.guideme.entity;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Reviews")
public class Review {
    @PrimaryKey(autoGenerate = true)
    private int RvId;
    @ColumnInfo(name = "userid")
    private int userid;
    @ColumnInfo(name = "dateRev")
    private String date;
    @ColumnInfo(name = "clean")
    private int clean;
    @ColumnInfo(name = "place")
    private int place;
    @ColumnInfo(name = "service")
    private int service;
    @ColumnInfo(name = "quality")
    private int quality;
    @ColumnInfo(name = "cafeid")
    @Nullable
    private int cafeid;
    @ColumnInfo(name = "museumid")
    @Nullable
    private int museumid;
    @ColumnInfo(name = "restoid")
    @Nullable
    private int restoid;
    @ColumnInfo(name = "loungeid")
    @Nullable
    private int loungeid;

    public int getRvId() {
        return RvId;
    }

    public void setRvId(int rvId) {
        RvId = rvId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCafeid() {
        return cafeid;
    }

    public void setCafeid(int cafeid) {
        this.cafeid = cafeid;
    }

    public int getMuseumid() {
        return museumid;
    }

    public void setMuseumid(int museumid) {
        this.museumid = museumid;
    }

    public int getRestoid() {
        return restoid;
    }

    public void setRestoid(int restoid) {
        this.restoid = restoid;
    }

    public int getLoungeid() {
        return loungeid;
    }

    public void setLoungeid(int loungeid) {
        this.loungeid = loungeid;
    }

    public Review(int rvId, int userid, String date, int clean, int place, int service, int quality, int cafeid, int museumid, int restoid, int loungeid) {
        RvId = rvId;
        this.userid = userid;
        this.date = date;
        this.clean = clean;
        this.place = place;
        this.service = service;
        this.quality = quality;
        this.cafeid = cafeid;
        this.museumid = museumid;
        this.restoid = restoid;
        this.loungeid = loungeid;
    }

    @Override
    public String toString() {
        return "Review{" +
                "RvId=" + RvId +
                ", userid=" + userid +
                ", date='" + date + '\'' +
                ", clean=" + clean +
                ", place=" + place +
                ", service=" + service +
                ", quality='" + quality + '\'' +
                ", cafeid=" + cafeid +
                ", museumid=" + museumid +
                ", restoid=" + restoid +
                ", loungeid=" + loungeid +
                '}';
    }
}
