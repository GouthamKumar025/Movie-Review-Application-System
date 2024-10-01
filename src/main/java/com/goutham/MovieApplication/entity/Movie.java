package com.goutham.MovieApplication.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"users", "reviews"})
public class Movie {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String title;
    private String releaseDate;
    private String genre;
    private String director;
    private String cast;
    private Double rating;
    @ManyToMany(mappedBy = "movies")
    private Set<User> users;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Review> reviews;
}
