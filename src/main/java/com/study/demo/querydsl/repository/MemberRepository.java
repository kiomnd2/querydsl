package com.study.demo.querydsl.repository;

import com.study.demo.querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

    // select m from mbmber m where m.username = ?
    List<Member> findByUsername(String username);


}
