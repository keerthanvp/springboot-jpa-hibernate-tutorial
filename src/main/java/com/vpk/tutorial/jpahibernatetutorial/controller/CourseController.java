package com.vpk.tutorial.jpahibernatetutorial.controller;

import com.vpk.tutorial.jpahibernatetutorial.entity.Course;
import com.vpk.tutorial.jpahibernatetutorial.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    private ResponseEntity<Course> create(@RequestBody Course course){
        return new ResponseEntity<>(courseService.create(course), HttpStatus.CREATED);
    }

    @GetMapping("/course")
    private ResponseEntity<List<Course>> retrieve(){
        return new ResponseEntity<>(courseService.retrieve(),HttpStatus.OK);
    }

    @GetMapping("/course/{id}")
    private ResponseEntity<Course> retrieve(Integer id){
        return new ResponseEntity<>(courseService.retrieve(id),HttpStatus.OK);
    }

    @PutMapping("/course")
    private ResponseEntity<Course> update(@RequestBody Course course){
        return new ResponseEntity<>(courseService.update(course),HttpStatus.OK);
    }

    @DeleteMapping("/course/{id}")
    private ResponseEntity<Course> delete(@RequestBody Integer id){
        return new ResponseEntity<>(courseService.delete(id),HttpStatus.OK);
    }

}
