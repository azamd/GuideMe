package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Museum;

import java.util.List;

@Dao
public interface MuseumDao {
    @Insert
    void InsertOne(Museum ms);
    @Delete
    void Delete(Museum ms);
    @Query("SELECT * FROM Museums")
    List<Museum> getAll();
}
