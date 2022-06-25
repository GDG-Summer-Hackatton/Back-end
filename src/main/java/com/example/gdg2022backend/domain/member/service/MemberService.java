package com.example.gdg2022backend.domain.member.service;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	public Member findByEmailAndPassword(final String email, final String password) {
		return memberRepository.findByEmailAndPassword(email, password).orElseThrow();
	}
}
