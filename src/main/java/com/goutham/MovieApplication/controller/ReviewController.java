package com.goutham.MovieApplication.controller;

import com.goutham.MovieApplication.entity.Review;
import com.goutham.MovieApplication.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/save_reviews")
    public String saveReviews(@RequestBody Review review){
        reviewService.saveReviews(review);
        return "Movies added successfully";
    }

    @GetMapping("/reviews")
    public List<Review> getReviews(){
        return reviewService.getReviews();
    }

    @DeleteMapping("/reviews/delete/{id}")
    public String deleteReviewsById(@PathVariable("id")Long id){
        reviewService.deleteReviewsById(id);
        return "Review deleted Successfully";
    }

    @PutMapping("/reviews/update/{id}")
    public Review updateReviewsById(@PathVariable("id") Long id, @RequestBody Review review){
        return reviewService.updateReviewsById(id,review);
    }
}
