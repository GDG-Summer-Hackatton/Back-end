package com.example.gdg2022backend.web.survey;

import com.example.gdg2022backend.domain.survey.service.SurveyService;
import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import com.example.gdg2022backend.web.survey.response.SurveyFindReqeust;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "조사")
@RequiredArgsConstructor
@RestController
public class SurveyController {

	private final SurveyService surveyService;

	@Operation(summary = "추가", description = "이미 존재하는 survey가 있는 경우 기존 survey는 삭제된다.")
	@PostMapping("/survey")
	public void add(@RequestBody final SurveyAddReqeust request) {
		surveyService.save(request.getMemberId(), request.getResult());
	}

	@Operation(summary = "조회")
	@GetMapping("/survey")
	public SurveyFindReqeust add(@RequestParam final Long memberId) {
		return new SurveyFindReqeust(surveyService.findByMemberId(memberId).getResult());
	}
}
