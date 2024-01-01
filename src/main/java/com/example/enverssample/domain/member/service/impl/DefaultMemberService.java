package com.example.enverssample.domain.member.service.impl;

import com.example.enverssample.domain.member.model.Member;
import com.example.enverssample.domain.member.model.request.MemberCreateRequest;
import com.example.enverssample.domain.member.repository.MemberRepository;
import com.example.enverssample.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DefaultMemberService implements MemberService {

    private final MemberRepository memberRepository;


    @Transactional
    @Override
    public void create(MemberCreateRequest memberCreateRequest) {
        Member member = Member.builder()
                .name(memberCreateRequest.name())
                .build();

        memberRepository.save(member);
    }

    @Override
    public void getByName(String name) {
        Member member = memberRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException());
    }
}
