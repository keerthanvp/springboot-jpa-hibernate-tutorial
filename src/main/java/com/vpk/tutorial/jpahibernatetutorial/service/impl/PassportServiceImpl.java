package com.vpk.tutorial.jpahibernatetutorial.service.impl;

import com.vpk.tutorial.jpahibernatetutorial.entity.Passport;
import com.vpk.tutorial.jpahibernatetutorial.repository.PassportRepository;
import com.vpk.tutorial.jpahibernatetutorial.service.PassportService;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    private PassportRepository passportRepository;

    private static final Logger logger = LoggerFactory.getLogger(PassportServiceImpl.class);

    @Override
    public Passport create(Passport passport) {
        return passportRepository.save(passport);
    }

    @Override
    public List<Passport> retrieve() {
        return passportRepository.findAll();
    }

    @Override
    public Passport retrieve(Integer id) {
        Optional<Passport> optionalPassport = passportRepository.findById(id);
        if (!optionalPassport.isPresent())
            throw new RuntimeException("Passport Not Found: " + id);
        return optionalPassport.get();
    }

    @Override
    public Passport delete(Integer id) {
        Optional<Passport> optionalPassport = passportRepository.findById(id);
        if (!optionalPassport.isPresent())
            throw new RuntimeException("Passport Not Found: " + id);
        passportRepository.deleteById(id);
        return optionalPassport.get();
    }

    @Override
    public Passport update(Passport passport) {
        return passportRepository.save(passport);
    }
}
