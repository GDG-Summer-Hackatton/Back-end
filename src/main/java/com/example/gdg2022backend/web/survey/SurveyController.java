package com.example.gdg2022backend.web.survey;

import com.example.gdg2022backend.domain.survey.service.SurveyService;
import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import com.example.gdg2022backend.web.survey.response.SurveyFindResponse;
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
        surveyService.save(request.getMemberId(), request.getQ1(), request.getQ2(), request.getQ3(), request.getQ4(), request.getQ5(), request.getQ6(), request.getQ7(), request.getQ8(), request.getQ9(), request.getQ10(), request.getQ11(), request.getQ12());
    }

	@Operation(summary = "조회")
	@GetMapping("/survey")
	public SurveyFindResponse add(@RequestParam final Long memberId) {
		return new SurveyFindResponse(surveyService.findByMemberId(memberId));
	}
}
