package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Review;

import java.util.List;

@Dao
public interface ReviewDao {
    @Insert
    void InsertOne(Review rv);
    @Delete
    void Delete(Review rv);
    @Query("SELECT * FROM Reviews")
    List<Review> getAll();
}
