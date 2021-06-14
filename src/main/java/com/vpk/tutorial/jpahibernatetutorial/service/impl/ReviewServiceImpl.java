package com.vpk.tutorial.jpahibernatetutorial.service.impl;

import com.vpk.tutorial.jpahibernatetutorial.entity.Course;
import com.vpk.tutorial.jpahibernatetutorial.entity.Review;
import com.vpk.tutorial.jpahibernatetutorial.exception.CourseNotFoundException;
import com.vpk.tutorial.jpahibernatetutorial.repository.CourseRepository;
import com.vpk.tutorial.jpahibernatetutorial.repository.ReviewRepository;
import com.vpk.tutorial.jpahibernatetutorial.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Review create(Integer courseId, Review review) {
        return courseRepository.findById(courseId)
                .map(course -> {
                    review.setCourse(course);
                    return reviewRepository.save(review);
                })
                .orElseThrow(() -> new CourseNotFoundException("Course Not Found: " + courseId));
    }

    @Override
    public List<Review> retrieve(Integer courseId) {
        return courseRepository.findById(courseId)
                .map(Course::getReviews)
                .orElseThrow(() -> new CourseNotFoundException("Course Not Found: " + courseId));
    }

    @Override
    public Review update(Integer courseId, Review review) {
        return null;
    }

    @Override
    public Review delete(Integer courseId, Review review) {
        return null;
    }
}
