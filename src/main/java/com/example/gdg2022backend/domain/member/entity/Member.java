package com.example.gdg2022backend.domain.member.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;
	private String password;
	private Boolean hasSurvey;

	public Member(final String email, final String password, final Boolean hasSurvey) {
		this.email = email;
		this.password = password;
		this.hasSurvey = hasSurvey;
	}
}
