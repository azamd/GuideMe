package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.esprit.guideme.entity.User;
import com.esprit.guideme.entity.UserWithBookings;
import com.esprit.guideme.entity.UserWithReviews;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void InsertOne(User u);
    @Delete
    void Delete(User u);

    @Query("SELECT * FROM Users")
    List<User> getAll();

    @Query("SELECT * FROM Users WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM Users WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Query("SELECT * FROM Users WHERE email LIKE :email LIMIT 1")
    User findByEmail(String email);

    @Query("SELECT * FROM Users WHERE uid=:uid LIMIT 1")
    User findById(int uid);

    @Transaction
    @Query("SELECT * FROM Users")
    public List<UserWithBookings> getUsersWithBookings();

    @Transaction
    @Query("SELECT * FROM Users")
    public List<UserWithReviews> getUsersWithReviews();

    @Insert
    void insertAll(User... users);

    @Update(entity = User.class)
    void update(User user);

    @Delete
    void delete(User user);
}
