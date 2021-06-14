package com.vpk.tutorial.jpahibernatetutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vpk.tutorial.jpahibernatetutorial.model.Rating;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Review> reviews;
}
