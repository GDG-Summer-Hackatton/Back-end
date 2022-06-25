package com.example.gdg2022backend.web.survey.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurveyAddReqeust {

	private Long memberId;
	private String result;
}
