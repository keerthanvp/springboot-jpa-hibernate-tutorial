package com.vpk.tutorial.jpahibernatetutorial.repository;

import com.vpk.tutorial.jpahibernatetutorial.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
