package com.vpk.tutorial.jpahibernatetutorial.controller;

import com.vpk.tutorial.jpahibernatetutorial.entity.Review;
import com.vpk.tutorial.jpahibernatetutorial.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/course/{id}/review")
    private ResponseEntity<Review> create(@PathVariable Integer id, @RequestBody Review review){
        return new ResponseEntity<>(reviewService.create(id, review), HttpStatus.CREATED);
    }

    @GetMapping("/course/{id}/review")
    private ResponseEntity<List<Review>> retrieve(@PathVariable Integer id){
        return new ResponseEntity<>(reviewService.retrieve(id), HttpStatus.OK);
    }
}
