package com.example.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String remarks;
}
