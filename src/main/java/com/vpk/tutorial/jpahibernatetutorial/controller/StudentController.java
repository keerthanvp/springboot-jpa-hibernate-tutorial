package com.vpk.tutorial.jpahibernatetutorial.controller;

import com.vpk.tutorial.jpahibernatetutorial.entity.Passport;
import com.vpk.tutorial.jpahibernatetutorial.entity.Student;
import com.vpk.tutorial.jpahibernatetutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    private ResponseEntity<Student> create(@RequestBody Student student){
        return new ResponseEntity<>(studentService.create(student), HttpStatus.CREATED);
    }

    @GetMapping("/student")
    private ResponseEntity<List<Student>> retrieve(){
        return new ResponseEntity<>(studentService.retrieve(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    private ResponseEntity<Student> retrieve(@PathVariable Integer id){
        return new ResponseEntity<>(studentService.retrieve(id), HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    private ResponseEntity<Student> delete(@PathVariable Integer id){
        return new ResponseEntity<>(studentService.delete(id),HttpStatus.OK);
    }

    @PutMapping("/student")
    private ResponseEntity<Student> update(@RequestBody Student student){
        return new ResponseEntity<>(studentService.update(student), HttpStatus.OK);
    }
}
