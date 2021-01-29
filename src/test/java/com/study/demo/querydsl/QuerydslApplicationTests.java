package com.study.demo.querydsl;

import com.study.demo.querydsl.entity.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class QuerydslApplicationTests {

    @Autowired
    EntityManager em;
    @Test
    void contextLoads() {

        Hello hello = new Hello();
        em.persist(hello);


    }

}
