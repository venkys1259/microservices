package com.example.ratings.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;


public class UserRating {

    private Integer userId;
    private List<Rating> ratings;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    public void initData(Integer userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating(100L, 3),
                new Rating(200L, 4)
        ));
    }
}
