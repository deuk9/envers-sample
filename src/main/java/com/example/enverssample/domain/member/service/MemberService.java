package com.example.enverssample.domain.member.service;

import com.example.enverssample.domain.member.model.request.MemberCreateRequest;

public interface MemberService {
    void create(MemberCreateRequest memberCreateRequest);

    void getByName(String name);
}
