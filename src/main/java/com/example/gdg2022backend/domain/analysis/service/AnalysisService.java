package com.example.gdg2022backend.domain.analysis.service;

import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class AnalysisService {

	public SurveyResult analysis(final Survey survey) {
		return new SurveyResult(survey);
	}
}
