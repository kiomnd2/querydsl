package com.study.demo.querydsl.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자 필요
@Getter @Setter
@Entity
@ToString(of = {"id", "name"})
public class Team {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
    List<Member> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

}

