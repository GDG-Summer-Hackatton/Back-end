package com.example.gdg2022backend.domain.analysis.service;

import com.example.gdg2022backend.domain.analysis.service.dto.MatchingChickenResult;
import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import com.example.gdg2022backend.domain.chicken.repository.ChickenJpaRepository;
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
    private final ChickenJpaRepository chickenJpaRepository;

    // TODO surveyResult로 매칭되는 치킨 생성
    //   매칭 순서대로 탑 10
    public List<MatchingChickenResult> matchChicken(final SurveyResult surveyResult) {
        return chickenJpaRepository.matchingChicken(surveyResult);
    }
}
