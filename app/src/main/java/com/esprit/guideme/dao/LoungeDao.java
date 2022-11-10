package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Lounge;

import java.util.List;

@Dao
public interface LoungeDao {
    @Insert
    void InsertOne(Lounge lg);
    @Delete
    void Delete(Lounge lg);
    @Query("SELECT * FROM Lounges")
    List<Lounge> getAll();
}
