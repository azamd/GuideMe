package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.User;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void InsertOne(User u);
    @Delete
    void Delete(User u);
    @Query("SELECT * FROM Users")
    List<User> getAll();
}
