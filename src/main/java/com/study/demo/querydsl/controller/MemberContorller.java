package com.study.demo.querydsl.controller;

import com.study.demo.querydsl.dto.MemberSearchCondition;
import com.study.demo.querydsl.dto.MemberTeamDto;
import com.study.demo.querydsl.repository.MemberJpaRepository;
import com.study.demo.querydsl.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberContorller {

    private final MemberJpaRepository memberJpaRepository;

    private final MemberRepository memberRepository;

    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1(MemberSearchCondition condition) {
        return memberJpaRepository.search(condition);
    }


    @GetMapping("/v2/members")
    public Page<MemberTeamDto> searchMemberV2(MemberSearchCondition condition, Pageable pageable) {

        return memberRepository.searchPageSimple(condition, pageable);
    }

    @GetMapping("/v3/members")
    public Page<MemberTeamDto> searchMemberV3(MemberSearchCondition condition, Pageable pageable) {

        return memberRepository.searchPageComplex(condition, pageable);
    }
}
