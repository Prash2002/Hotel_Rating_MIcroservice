package com.example.rating.service;

import com.example.rating.model.Rating;
import com.example.rating.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    public Rating addRating(Rating r){
        return ratingRepo.save(r);
    }
    public List<Rating> getAllRatings(){
        return ratingRepo.findAll();
    }
    public List<Rating> getRatingByUser(String i){
        return ratingRepo.findByUserId(i);
    }
    public List<Rating> getRatingforHotel(String i){
        return ratingRepo.findByHotelId(i);
    }
}
