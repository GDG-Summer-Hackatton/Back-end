package com.example.gdg2022backend.web.survey.response;

import com.example.gdg2022backend.domain.survey.entity.Survey;
import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import com.example.gdg2022backend.web.survey.type.Q1;
import com.example.gdg2022backend.web.survey.type.Q2;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurveyFindResponse {

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

	public SurveyFindResponse(final Survey survey){
		this.q1 = survey.getQ1();
		this.q2 = survey.getQ2();
		this.q3 = survey.getQ3();
		this.q4 = survey.getQ4();
		this.q5 = survey.getQ5();
		this.q6 = survey.getQ6();
		this.q7 = survey.getQ7();
		this.q8 = survey.getQ8();
		this.q9 = survey.getQ9();
		this.q10 = survey.getQ10();
		this.q11 = survey.getQ11();
		this.q12 = survey.getQ12();
	}
}
