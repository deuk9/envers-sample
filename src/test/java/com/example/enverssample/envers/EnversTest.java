package com.example.enverssample.envers;

import com.example.enverssample.domain.member.repository.MemberRepository;
import com.example.enverssample.domain.team.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class EnversTest {


    @Test
    @Transactional
    void enversTest() {

    }

}
