package com.vpk.tutorial.jpahibernatetutorial.repository;

import com.vpk.tutorial.jpahibernatetutorial.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
