package com.esprit.guideme.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Regions")
public class Region {
    @PrimaryKey(autoGenerate = true)
    private int Rid;

    @ColumnInfo(name = "name")
    private String regionName;

    public int getRid() {
        return Rid;
    }

    public void setRid(int rid) {
        Rid = rid;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Region(int rid, String regionName) {
        Rid = rid;
        this.regionName = regionName;
    }

    public Region() {
    }

    @Override
    public String toString() {
        return "Region{" +
                "Rid=" + Rid +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
