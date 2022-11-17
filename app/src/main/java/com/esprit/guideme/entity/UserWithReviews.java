package com.esprit.guideme.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UserWithReviews {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "uid",
            entityColumn = "userid"
    )
    public List<Review> reviews;
}
