package com.bdb.spring.demo.entity;

import com.bdb.spring.demo.constant.Gender;
import com.bdb.spring.demo.converter.GenderEnumConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Convert(converter = GenderEnumConverter.class)
    private Gender gender;
}
