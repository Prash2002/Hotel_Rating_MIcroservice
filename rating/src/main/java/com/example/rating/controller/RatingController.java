package com.example.rating.controller;

import com.example.rating.model.Rating;
import com.example.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @GetMapping("/all")
    public  List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
    }
    @GetMapping("/user/{id}")
    public List<Rating> getRatingsByUser(@PathVariable String id){
        return ratingService.getRatingByUser(id);
    }

    @GetMapping("/hotel/{id}")
    public List<Rating> getRatingsForHotel(@PathVariable String id){
        return ratingService.getRatingforHotel(id);
    }

    @PostMapping("/add")
    public Rating createUser(@RequestBody Rating u){
        return ratingService.addRating(u);
    }

}
