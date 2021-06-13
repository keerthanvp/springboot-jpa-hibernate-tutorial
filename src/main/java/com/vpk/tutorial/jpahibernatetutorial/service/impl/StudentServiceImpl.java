package com.vpk.tutorial.jpahibernatetutorial.service.impl;

import com.vpk.tutorial.jpahibernatetutorial.entity.Student;
import com.vpk.tutorial.jpahibernatetutorial.repository.StudentRepository;
import com.vpk.tutorial.jpahibernatetutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> retrieve() {
        return studentRepository.findAll();
    }

    @Override
    public Student retrieve(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent())
            throw new RuntimeException("Student Not Found: "+id);
        return studentOptional.get();
    }

    @Override
    public Student delete(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent())
            throw new RuntimeException("Student Not Found: "+id);
        studentRepository.deleteById(id);
        return studentOptional.get();
    }
}
