package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.entity.Review;
import com.goutham.MovieApplication.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void saveReviews(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public void deleteReviewsById(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public Review updateReviewsById(Long id, Review review) {
        Review rev = reviewRepository.findById(id).get();

        if(Objects.nonNull(review.getRating())){
            rev.setRating(review.getRating());
        }
        if(Objects.nonNull(review.getReviewText())){
            rev.setReviewText(review.getReviewText());
        }
        if(Objects.nonNull(review.getReviewDate())){
            rev.setReviewDate(review.getReviewDate());
        }

        return reviewRepository.save(rev);

    }
}
