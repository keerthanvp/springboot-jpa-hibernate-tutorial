package com.vpk.tutorial.jpahibernatetutorial.service;

import com.vpk.tutorial.jpahibernatetutorial.entity.Course;

import java.util.List;

public interface CourseService {
    Course create(Course course);
    List<Course> retrieve();
    Course retrieve(Integer id);
    Course delete(Integer id);
    Course update(Course course);
}
