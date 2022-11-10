package com.esprit.guideme.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.esprit.guideme.dao.UserDao;
import com.esprit.guideme.dao.CafeDao;
import com.esprit.guideme.dao.LoungeDao;
import com.esprit.guideme.dao.MuseumDao;
import com.esprit.guideme.dao.RestoDao;
import com.esprit.guideme.dao.RegionDao;
import com.esprit.guideme.dao.ReviewDao;
import com.esprit.guideme.dao.BookingDao;

import com.esprit.guideme.entity.Booking;
import com.esprit.guideme.entity.Cafe;
import com.esprit.guideme.entity.Lounge;
import com.esprit.guideme.entity.Museum;
import com.esprit.guideme.entity.Region;
import com.esprit.guideme.entity.Resto;
import com.esprit.guideme.entity.Review;
import com.esprit.guideme.entity.User;


@Database(entities = {User.class, Region.class, Resto.class, Cafe.class, Lounge.class, Museum.class, Booking.class, Review.class}, version = 1, exportSchema = false)

public abstract class DataBase extends RoomDatabase {
    private static DataBase instance;
    public abstract UserDao userDao();
    public abstract RegionDao regionDao();
    public abstract LoungeDao loungeDao();
    public abstract CafeDao cafeDao();
    public abstract MuseumDao museumDao();
    public abstract RestoDao restoDao();
    public abstract ReviewDao reviewDao();
    public abstract BookingDao bookingDao();


    public static DataBase getDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), DataBase.class, "guide_me_db")

                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
}
