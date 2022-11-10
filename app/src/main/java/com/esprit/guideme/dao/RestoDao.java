package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Resto;

import java.util.List;

@Dao
public interface RestoDao {
    @Insert
    void InsertOne(Resto rs);
    @Delete
    void Delete(Resto rs);
    @Query("SELECT * FROM Restos")
    List<Resto> getAll();
}
