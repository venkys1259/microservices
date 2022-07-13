package com.example.ratings.model;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    private Long movieId;
    private int rating;

    public Rating() {
    }

    public Rating(Long movieId, int rating) {
        this.movieId = movieId;
        this.rating= rating;
    }

    @Id
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
