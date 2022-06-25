package com.example.gdg2022backend.domain.member.entity;

import com.example.gdg2022backend.domain.survey.entity.Survey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {

	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;
	private String password;

	@OneToOne
	@JoinColumn(name = "survey_id")
	private Survey survey;

	public Member(final String email, final String password) {
		this.email = email;
		this.password = password;
		this.survey = null;
	}

	public void updateSurvey(final Survey survey) {
		this.survey = survey;
	}
}
