package com.example.gdg2022backend.web.analysis;

import com.example.gdg2022backend.domain.analysis.service.AnalysisService;
import com.example.gdg2022backend.domain.analysis.service.MatchingChickenService;
import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import com.example.gdg2022backend.domain.survey.service.SurveyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "분석")
@RequiredArgsConstructor
@RestController
public class AnalysisController {

	private final SurveyService surveyService;
	private final AnalysisService analysisService;
	private final MatchingChickenService matchingChickenService;

	@Operation(summary = "분석")
	@GetMapping("/analysis")
	public List<Object> analysis(@RequestParam final Long memberId) {
		final Survey survey = surveyService.findByMemberId(memberId);
		final SurveyResult surveyResult = analysisService.analysis(survey);
		return matchingChickenService.matchChicken(surveyResult);
	}
}
