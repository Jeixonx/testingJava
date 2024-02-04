package com.platzi.javatests.movies.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Movie {
    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name, int minutes, Genre genre){
        this(null, name, minutes, genre);
    }

}
