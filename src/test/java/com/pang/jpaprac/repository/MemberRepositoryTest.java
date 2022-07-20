package com.pang.jpaprac.repository;

import com.pang.jpaprac.domain.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


    @Test
    @DisplayName("멤버 테스트")
    @Transactional
    public void testMember() throws Exception{
        // given
        Member member = new Member();
        member.setUsername("MemberA");

        // when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        // then
        assertThat(findMember.getId()).isEqualTo(saveId);
        assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
    }



}