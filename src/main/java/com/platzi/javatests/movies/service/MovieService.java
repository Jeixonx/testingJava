package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;
    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return  movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());


    }

    public Collection<Movie> findMoviesByLength(int length) {

        return  movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());

    }
}
