package com.example.gdg2022backend.config;

import com.example.gdg2022backend.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InitData {

	private final MemberRepository memberRepository;

	@Bean
	public void init() {
//		memberRepository.save(new Member("choi8608@gmail.com", "1234", false));
//		memberRepository.save(new Member("choi9999@gmail.com", "1234", false));
	}
}
