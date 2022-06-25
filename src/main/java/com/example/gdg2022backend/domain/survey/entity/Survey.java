package com.example.gdg2022backend.domain.survey.entity;

import com.example.gdg2022backend.domain.member.entity.Member;

import javax.persistence.*;

import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Survey {

	@Id
	@Column(name = "survey_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "survey")
	private Member member;

	private String q1;
	private String q2;
	private String q3;
	private String q4;
	private String q5;
	private String q6;
	private String q7;
	private String q8;
	private String q9;
	private String q10;
	private String q11;

	public Survey(final Member member, final String q1, final String q2, final String q3, final String q4, final String q5, final String q6, final String q7, final String q8, final String q9, final String q10, final String q11) {
		this.member = member;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.q7 = q7;
		this.q8 = q8;
		this.q9 = q9;
		this.q10 = q10;
		this.q11 = q11;
	}
}
