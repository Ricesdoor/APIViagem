package com.example.APIViagem.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Destination {
    private Long id;
    private String name;
    private String location;
    private String description;
    private double rating;
    private int ratingCount;


}
