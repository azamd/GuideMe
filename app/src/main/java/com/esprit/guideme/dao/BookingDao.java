package com.esprit.guideme.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.guideme.entity.Booking;

import java.util.List;

@Dao
public interface BookingDao {
    @Insert
    void InsertOne(Booking bk);
    @Delete
    void Delete(Booking bk);
    @Query("SELECT * FROM Bookings")
    List<Booking> getAll();
}
