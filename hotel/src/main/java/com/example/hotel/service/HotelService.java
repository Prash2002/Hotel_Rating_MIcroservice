package com.example.hotel.service;

import com.example.hotel.model.Hotel;
import com.example.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public Hotel createHotel(Hotel Hotel){
        return hotelRepository.save(Hotel);
    }

    public Hotel getHotel(String id){
        return hotelRepository.findById(id).orElse(null);
    }

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel updateHotel(Hotel hotel, String id){
        Hotel a = hotelRepository.findById(id).orElse(null);
        a.setName(hotel.getName());
        a.setLocation(hotel.getLocation());
        a.setAbout(hotel.getAbout());
        hotelRepository.save(a);
        return a;
    }
    public String deleteHotel(String id){
        hotelRepository.deleteById(id);
        return "Hotel Deleted";
    }
}
