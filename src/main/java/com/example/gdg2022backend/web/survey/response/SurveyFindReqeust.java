package com.example.gdg2022backend.web.survey.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurveyFindReqeust {

	private String result;

	public SurveyFindReqeust(final String result) {
		this.result = result;
	}
}
