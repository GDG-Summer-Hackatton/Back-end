package com.example.gdg2022backend.web.survey.request;

import com.example.gdg2022backend.web.survey.type.Q1;
import com.example.gdg2022backend.web.survey.type.Q10;
import com.example.gdg2022backend.web.survey.type.Q11;
import com.example.gdg2022backend.web.survey.type.Q2;
import com.example.gdg2022backend.web.survey.type.Q3;
import com.example.gdg2022backend.web.survey.type.Q4;
import com.example.gdg2022backend.web.survey.type.Q5;
import com.example.gdg2022backend.web.survey.type.Q6;
import com.example.gdg2022backend.web.survey.type.Q7;
import com.example.gdg2022backend.web.survey.type.Q8;
import com.example.gdg2022backend.web.survey.type.Q9;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurveyAddReqeust {

	private Long memberId;
	private Q1 q1;
	private Q2 q2;
	private Q3 q3;
	private Q4 q4;
	private Q5 q5;
	private Q6 q6;
	private Q7 q7;
	private Q8 q8;
	private Q9 q9;
	private Q10 q10;
	private Q11 q11;
	private String Q12;
}
