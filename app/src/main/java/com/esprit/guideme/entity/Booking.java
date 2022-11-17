package com.esprit.guideme.entity;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Bookings")
public class Booking {
    @PrimaryKey(autoGenerate = true)
    private int BkId;
    @ColumnInfo(name = "userid")
    private int userid;
    @ColumnInfo(name = "dateBk")
    private String date;
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

    public int getBkId() {
        return BkId;
    }

    public void setBkId(int bkId) {
        BkId = bkId;
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

    public Booking(int bkId, int userid, String date, int cafeid, int museumid, int restoid, int loungeid) {
        BkId = bkId;
        this.userid = userid;
        this.date = date;
        this.cafeid = cafeid;
        this.museumid = museumid;
        this.restoid = restoid;
        this.loungeid = loungeid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "BkId=" + BkId +
                ", userid=" + userid +
                ", date='" + date + '\'' +
                ", cafeid=" + cafeid +
                ", museumid=" + museumid +
                ", restoid=" + restoid +
                ", loungeid=" + loungeid +
                '}';
    }
}
