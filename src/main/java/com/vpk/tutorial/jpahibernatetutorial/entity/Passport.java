package com.vpk.tutorial.jpahibernatetutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
    private Student student;

    public Passport(Integer id, String number) {
        this.id = id;
        this.number = number;
    }
}
