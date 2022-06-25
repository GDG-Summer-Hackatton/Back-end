package com.example.gdg2022backend.web.member;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.service.MemberService;
import com.example.gdg2022backend.web.member.request.MemberLoginReqeust;
import com.example.gdg2022backend.web.member.response.MemberLoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "회원")
@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;

	@Operation(summary = "로그인")
	@PostMapping("/member/login")
	public MemberLoginResponse login(@RequestBody final MemberLoginReqeust request) {
		final Member member = memberService.findByEmailAndPassword(request.getEmail(), request.getPassword());
		return new MemberLoginResponse(member);
	}
}
