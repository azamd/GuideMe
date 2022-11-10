package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Region;

import java.util.List;

@Dao
public interface RegionDao {
    @Insert
    void InsertOne(Region rg);
    @Delete
    void Delete(Region rg);
    @Query("SELECT * FROM Regions")
    List<Region> getAll();
}
