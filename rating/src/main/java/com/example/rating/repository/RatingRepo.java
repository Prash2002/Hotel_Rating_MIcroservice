package com.example.rating.repository;

import com.example.rating.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating, String> {
    List<Rating> findByUserId(String user_id);
    List<Rating> findByHotelId(String hotel_id);

}
