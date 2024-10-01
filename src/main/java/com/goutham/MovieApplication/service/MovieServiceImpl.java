package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.entity.Movie;
import com.goutham.MovieApplication.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void saveMovies(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> fetchAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> fetchMoviesByDirector(String director) {
        return movieRepository.getMovieByDirector(director);
    }

    @Override
    public void deleteMoviesById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie updateMoviesById(Long id, Movie movie) {
        Movie mv = movieRepository.findById(id).get();

        if(Objects.nonNull(movie.getTitle())){
            mv.setTitle(movie.getTitle());
        }
        if(Objects.nonNull(movie.getReleaseDate())){
            mv.setReleaseDate(movie.getReleaseDate());
        }
        if(Objects.nonNull(movie.getGenre())){
            mv.setGenre(movie.getGenre());
        }
        if(Objects.nonNull(movie.getDirector())){
            mv.setDirector(movie.getDirector());
        }
        if(Objects.nonNull(movie.getCast())){
            mv.setCast(movie.getCast());
        }
        if(Objects.nonNull(movie.getRating())){
            mv.setRating(movie.getRating());
        }
        return movieRepository.save(mv);
    }


}
