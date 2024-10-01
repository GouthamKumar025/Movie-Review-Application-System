package com.goutham.MovieApplication.controller;

import com.goutham.MovieApplication.entity.Movie;
import com.goutham.MovieApplication.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/movie/save_movie")
    public String saveMovies(@RequestBody Movie movie){
        movieService.saveMovies(movie);
        return "Movies added successfully";
    }

    @GetMapping("/movies")
    public List<Movie> fetchAllMovies(){
        return movieService.fetchAllMovies();
    }

    @GetMapping("/movies/{director}")
    public List<Movie> fetchMoviesByDirector(@PathVariable("director") String director){
        return movieService.fetchMoviesByDirector(director);
    }

    @DeleteMapping("/movies/delete_movie/{id}")
    public String deleteMoviesById(@PathVariable("id") Long id){
        movieService.deleteMoviesById(id);
        return "Movie Deleted Successfully";
    }

    @PutMapping("/movies/update_movie/{id}")
    public Movie updateMoviesById(@PathVariable("id") Long id, @RequestBody Movie movie){
        return movieService.updateMoviesById(id,movie);
    }

}
