package com.example.ratings.controller;

import com.example.ratings.exception.ResourceNotFoundException;
import com.example.ratings.model.Rating;
import com.example.ratings.model.UserRating;
import com.example.ratings.repository.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
    @Autowired
    private RatingsRepository ratingsRepository;

    @GetMapping("/ratings")
    public List<Rating> getAllRatings() {
        return ratingsRepository.findAll();
    }
    @GetMapping("/ratings/{movieId}")
    public ResponseEntity< Rating > getMovieRatingById(@PathVariable(value = "movieId") Long movieId)
            throws ResourceNotFoundException {
        Rating rating = ratingsRepository.findById(movieId)
                .orElseThrow(() -> new ResourceNotFoundException("Movie Rating not found for this id :: " + movieId));
        return ResponseEntity.ok().body(rating);
    }
    @PostMapping("/ratings")
    public Rating createRating(@RequestBody Rating rating) {
        return ratingsRepository.save(rating);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") Integer userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }
}
