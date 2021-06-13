package com.vpk.tutorial.jpahibernatetutorial.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Passport {

    @Id
    @GeneratedValue
    private Integer id;
    private String number;

}
