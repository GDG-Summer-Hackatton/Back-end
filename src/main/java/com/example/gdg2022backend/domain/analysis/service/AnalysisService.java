package com.example.gdg2022backend.domain.analysis.service;

import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.chicken.repository.ChickenRepository;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class AnalysisService {

	private final ChickenRepository chickenRepository;

	// TODO surveyResult 생성 로직
	public SurveyResult analysis(final Survey survey) {
		return new SurveyResult();
	}

	// TODO surveyResult로 매칭되는 치킨 생성
	//   매칭 순서대로 탑 10
	public List<Object> matchChicken(final SurveyResult surveyResult) {
		final long limitCount = 10L;
		return chickenRepository.findAll().stream()
				.limit(limitCount)
				.collect(Collectors.toList());
	}
}
