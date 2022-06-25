package com.example.gdg2022backend.web.common;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.service.MemberService;
import com.example.gdg2022backend.web.common.request.AuthReqeust;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "인증")
@RequiredArgsConstructor
@RestController
public class AuthController {

	private final MemberService memberService;

	@Operation(summary = "login")
	@PostMapping("/auth/login")
	public Member login(@RequestBody final AuthReqeust request) {
		return memberService.findByEmailAndPassword(request.getEmail(), request.getPassword());
	}
}
