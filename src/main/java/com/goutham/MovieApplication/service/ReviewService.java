package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.entity.Review;

import java.util.List;

public interface ReviewService {
    void saveReviews(Review review);

    List<Review> getReviews();

    void deleteReviewsById(Long id);

    Review updateReviewsById(Long id, Review review);
}
