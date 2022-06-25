package com.example.gdg2022backend.domain.analysis.service;

import com.example.gdg2022backend.domain.analysis.service.dto.MatchingChickenResult;
import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.chicken.repository.ChickenJpaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MatchingChickenService {

	private final ChickenJpaRepository chickenJpaRepository;

	public List<MatchingChickenResult> matchChicken(final SurveyResult surveyResult) {
		return chickenJpaRepository.matchingChicken(surveyResult);
	}
}
