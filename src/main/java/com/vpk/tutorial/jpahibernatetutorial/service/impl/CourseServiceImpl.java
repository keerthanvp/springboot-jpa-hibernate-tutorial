package com.vpk.tutorial.jpahibernatetutorial.service.impl;

import com.vpk.tutorial.jpahibernatetutorial.entity.Course;
import com.vpk.tutorial.jpahibernatetutorial.exception.CourseNotFoundException;
import com.vpk.tutorial.jpahibernatetutorial.repository.CourseRepository;
import com.vpk.tutorial.jpahibernatetutorial.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> retrieve() {
        return courseRepository.findAll();
    }

    @Override
    public Course retrieve(Integer id) {
        return courseRepository.findById(id)
                .orElseThrow(()-> new CourseNotFoundException("Course Not Found: "+id));
    }

    @Override
    public Course update(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course delete(Integer id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if (!courseOptional.isPresent())
            throw new CourseNotFoundException("Course Not Found: "+id);
        courseRepository.deleteById(id);
        return courseOptional.get();
    }

}
