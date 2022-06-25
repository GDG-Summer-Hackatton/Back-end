package com.example.gdg2022backend.domain.survey.entity;

import com.example.gdg2022backend.domain.analysis.service.type.Q1;
import com.example.gdg2022backend.domain.analysis.service.type.Q10;
import com.example.gdg2022backend.domain.analysis.service.type.Q11;
import com.example.gdg2022backend.domain.analysis.service.type.Q2;
import com.example.gdg2022backend.domain.analysis.service.type.Q3;
import com.example.gdg2022backend.domain.analysis.service.type.Q4;
import com.example.gdg2022backend.domain.analysis.service.type.Q5;
import com.example.gdg2022backend.domain.analysis.service.type.Q6;
import com.example.gdg2022backend.domain.analysis.service.type.Q7;
import com.example.gdg2022backend.domain.analysis.service.type.Q8;
import com.example.gdg2022backend.domain.analysis.service.type.Q9;
import com.example.gdg2022backend.domain.member.entity.Member;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	private String q12;

	public Survey(final Member member, final Q1 q1, final Q2 q2, final Q3 q3, final Q4 q4, final Q5 q5, final Q6 q6, final Q7 q7, final Q8 q8, final Q9 q9, final Q10 q10, final Q11 q11, final String q12) {
		this.member = member;
		this.q1 = q1.name();
		this.q2 = q2.name();
		this.q3 = q3.name();
		this.q4 = q4.name();
		this.q5 = q5.name();
		this.q6 = q6.name();
		this.q7 = q7.name();
		this.q8 = q8.name();
		this.q9 = q9.name();
		this.q10 = q10.name();
		this.q11 = q11.name();
		this.q12 = q12;
	}
}
