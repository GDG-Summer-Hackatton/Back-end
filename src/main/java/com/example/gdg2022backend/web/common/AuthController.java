package com.example.gdg2022backend.web.common;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.service.MemberService;
import com.example.gdg2022backend.web.common.request.AuthReqeust;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AuthController {

	private final MemberService memberService;

	@PostMapping("/auth/login")
	public Member login(@RequestBody final AuthReqeust request) {
		return memberService.findByEmailAndPassword(request.getEmail(), request.getPassword());
	}
}
