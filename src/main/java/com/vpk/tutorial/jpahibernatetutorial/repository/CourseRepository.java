package com.vpk.tutorial.jpahibernatetutorial.repository;

import com.vpk.tutorial.jpahibernatetutorial.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
