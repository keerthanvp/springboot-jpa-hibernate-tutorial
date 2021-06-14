package com.vpk.tutorial.jpahibernatetutorial.service;

import com.vpk.tutorial.jpahibernatetutorial.entity.Review;

import java.util.List;

public interface ReviewService {
    Review create(Integer courseId, Review review);
    List<Review> retrieve(Integer courseId);
    Review update(Integer courseId, Review review);
    Review delete(Integer courseId, Review review);
}
