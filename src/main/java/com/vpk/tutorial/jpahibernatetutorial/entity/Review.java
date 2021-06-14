package com.vpk.tutorial.jpahibernatetutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vpk.tutorial.jpahibernatetutorial.model.Rating;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Review {

    @Id
    @GeneratedValue
    private Integer id;
    private Rating rating;
    private String description;

    @ManyToOne
    @JsonIgnore
    private Course course;
}
