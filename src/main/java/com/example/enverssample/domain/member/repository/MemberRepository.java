package com.example.enverssample.domain.member.repository;

import com.example.enverssample.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member, Long> {
}
