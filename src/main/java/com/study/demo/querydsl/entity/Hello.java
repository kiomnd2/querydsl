package com.study.demo.querydsl.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Hello {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
