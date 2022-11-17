package com.esprit.guideme.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UserWithBookings {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "uid",
            entityColumn = "userid"
    )
    public List<Booking> bookings;
}
