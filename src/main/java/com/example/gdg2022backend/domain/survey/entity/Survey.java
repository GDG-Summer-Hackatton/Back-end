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

	public Survey(final Member member, final SurveyAddReqeust request) {
		this.member = member;
		this.q1 =request.getQ1().getDescription();
		this.q2 =request.getQ2().getDescription();
		this.q3 =request.getQ3().getDescription();
		this.q4 =request.getQ4().getDescription();
		this.q5 =request.getQ5().getDescription();
		this.q6 =request.getQ6().getDescription();
		this.q7 =request.getQ7().getDescription();
		this.q8 =request.getQ8().getDescription();
		this.q9 =request.getQ9().getDescription();
		this.q10 =request.getQ10().getDescription();
		this.q11 =request.getQ11().getDescription();
	}
}
