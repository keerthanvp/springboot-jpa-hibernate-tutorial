package com.vpk.tutorial.jpahibernatetutorial.service;

import com.vpk.tutorial.jpahibernatetutorial.entity.Student;

import java.util.List;

public interface StudentService {
    Student create(Student student);
    List<Student> retrieve();
    Student retrieve(Integer id);
    Student delete(Integer id);
}
