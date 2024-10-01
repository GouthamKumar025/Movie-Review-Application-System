package com.goutham.MovieApplication.service;


import com.goutham.MovieApplication.entity.Movie;

import java.util.List;

public interface MovieService {
    void saveMovies(Movie movie);

    List<Movie> fetchAllMovies();

    List<Movie> fetchMoviesByDirector(String director);

    void deleteMoviesById(Long id);

    Movie updateMoviesById(Long id,Movie movie);
}
