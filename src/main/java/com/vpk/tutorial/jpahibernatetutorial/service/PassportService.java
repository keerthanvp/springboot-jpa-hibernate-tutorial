package com.vpk.tutorial.jpahibernatetutorial.service;

import com.vpk.tutorial.jpahibernatetutorial.entity.Passport;

import java.util.List;

public interface PassportService {
    Passport create(Passport passport);
    List<Passport> retrieve();
    Passport retrieve(Integer id);
    Passport delete(Integer id);
    Passport update(Passport passport);
}
