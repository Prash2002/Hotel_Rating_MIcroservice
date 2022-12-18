package com.example.user.service;

import com.example.user.model.Rating;
import com.example.user.model.User;
import com.example.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;
    public User createUser(User user){
        return userRepo.save(user);
    }

    public User getUser(String id){
        User u = userRepo.findById(id).orElse(null);
        //Get Ratings of the user from RATING SERVICE
        List<Rating> ratingListOfUser = restTemplate.getForObject("http://RATING-SERVICE/rating/user/"+id, List.class);
        u.setRatings(ratingListOfUser);
        return u;
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user, String id){
        User a = userRepo.findById(id).orElse(null);
        a.setName(user.getName());
        a.setEmail(user.getEmail());
        a.setAbout(user.getAbout());
        userRepo.save(a);
        return a;
    }
    public String deleteUser(String id){
        userRepo.deleteById(id);
        return "User Deleted";
    }
}
