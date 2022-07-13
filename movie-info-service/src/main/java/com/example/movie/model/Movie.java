package com.example.movie.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    private Long movieId;
    private String name;
    private String description;

    public Movie(){

    }

    public Movie(Long movieId, String name, String description) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
