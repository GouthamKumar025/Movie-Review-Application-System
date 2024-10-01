package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.MovieApplication;
import com.goutham.MovieApplication.entity.Movie;
import com.goutham.MovieApplication.entity.Review;
import com.goutham.MovieApplication.entity.User;
import com.goutham.MovieApplication.repository.MovieRepository;
import com.goutham.MovieApplication.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = MovieApplication.class)
class MovieServiceTest {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
        public void saveMovieWithReviews(){
        Review review = Review.builder().
                rating(7.9).
                reviewText("Good superhero movie").
                reviewDate("15 April 2008").
                build();

        Set<Review> reviewSet = new HashSet<>(Collections.singleton(review));

        Movie movie = Movie.builder().
                title("Iron Man").
                releaseDate("14 April 2008").
                genre("Sci-fi").
                director("Jon Favreau").
                cast("Robert Downey Jr").
                rating(7.9).
                reviews(reviewSet).
                build();

        movieRepository.save(movie);
        }

        @Test
        public void saveMoviesWithUser(){
            User user = User.builder().
                    userName("Mark").
                    password("mark@432").
                    email("mark476@gmail.com").build();

            Set<User> userSet = new HashSet<>(Collections.singleton(user));


            Movie movie = Movie.builder().
                    title("Captain America The First Avenger").
                    releaseDate("22 July 2011").
                    genre("Superhero/Scifi").
                    director("Joe Johnston").
                    cast("Chris Evans, Tommy Lee Jones").
                    rating(6.9).
                    users(userSet).
                    build();
            user.setMovies(new HashSet<>(Collections.singleton(movie)));
            Set<Movie> userMovies = new HashSet<>();
            userMovies.add(movie);
            user.setMovies(userMovies);

            Set<User> movieUsers = new HashSet<>();
            movieUsers.add(user);
            movie.setUsers(movieUsers);

            userRepository.save(user);
            movieRepository.save(movie);
        }


    }

