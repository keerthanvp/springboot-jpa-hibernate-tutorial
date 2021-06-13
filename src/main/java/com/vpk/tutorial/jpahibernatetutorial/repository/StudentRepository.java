package com.vpk.tutorial.jpahibernatetutorial.repository;

import com.vpk.tutorial.jpahibernatetutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
