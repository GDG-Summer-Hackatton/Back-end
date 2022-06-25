package com.example.gdg2022backend.web.member.response;

import com.example.gdg2022backend.domain.member.entity.Member;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberLoginResponse {

	private Long id;
	private String email;
	private Long surveyId;

	public MemberLoginResponse(final Member member) {
		this.id = member.getId();
		this.email = member.getEmail();
		this.surveyId = member.getSurvey().getId();
	}
}
