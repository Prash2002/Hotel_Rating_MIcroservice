package com.example.rating.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String remarks;
}
