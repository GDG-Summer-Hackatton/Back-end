package com.example.gdg2022backend.domain.analysis.service;

import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.chicken.repository.ChickenNativeQuery;
import com.example.gdg2022backend.domain.chicken.repository.ChickenRepository;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MatchingChickenService {

    private final ChickenRepository chickenRepository;
    private final ChickenNativeQuery chickenNativeQuery;

    // TODO surveyResult로 매칭되는 치킨 생성
    //   매칭 순서대로 탑 10
    public List<Object> matchChicken(final SurveyResult surveyResult) {
        final long limitCount = 10L;
		final Double score = surveyResult.getA1() + surveyResult.getA2() + surveyResult.getA3() + surveyResult.getB1() + surveyResult.getB2() + surveyResult.getB3() + surveyResult.getB4() + surveyResult.getC1() + surveyResult.getC2() + surveyResult.getC3() + surveyResult.getC4() + surveyResult.getD1() + surveyResult.getD2();
//		chickenNativeQuery
        return chickenRepository.findAll().stream()
                .limit(limitCount)
                .collect(Collectors.toList());
    }
}
