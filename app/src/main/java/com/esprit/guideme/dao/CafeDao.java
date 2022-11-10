package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Cafe;

import java.util.List;

@Dao
public interface CafeDao {
    @Insert
    void InsertOne(Cafe cf);
    @Delete
    void Delete(Cafe cf);
    @Query("SELECT * FROM Cafes")
    List<Cafe> getAll();
}
