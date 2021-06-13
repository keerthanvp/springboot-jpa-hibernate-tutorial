package com.vpk.tutorial.jpahibernatetutorial.controller;

import com.vpk.tutorial.jpahibernatetutorial.entity.Passport;
import com.vpk.tutorial.jpahibernatetutorial.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping("/passport")
    private ResponseEntity<Passport> create(@RequestBody Passport passport){
        return new ResponseEntity<>(passportService.create(passport), HttpStatus.CREATED);
    }

    @GetMapping("/passport")
    private ResponseEntity<List<Passport>> retrieve(){
        return new ResponseEntity<>(passportService.retrieve(),HttpStatus.OK);
    }

    @GetMapping("/passport/{id}")
    private ResponseEntity<Passport> retrieve(@PathVariable Integer id){
        return new ResponseEntity<>(passportService.retrieve(id),HttpStatus.OK);
    }

    @DeleteMapping("/passport/{id}")
    private ResponseEntity<Passport> delete(@PathVariable Integer id){
        return new ResponseEntity<>(passportService.delete(id),HttpStatus.OK);
    }

    @PutMapping("/passport")
    private ResponseEntity<Passport> update(@RequestBody Passport passport){
        return new ResponseEntity<>(passportService.update(passport),HttpStatus.OK);
    }
}
