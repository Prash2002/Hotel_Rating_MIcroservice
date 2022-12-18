package com.example.hotel.controller;

import com.example.hotel.model.Hotel;
import com.example.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable String id){
        return hotelService.getHotel(id);
    }

    @PostMapping("/create")
    public Hotel createHotel(@RequestBody Hotel h){
        return hotelService.createHotel(h);
    }

}
