package com.example.gdg2022backend.domain.survey.service;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.repository.MemberRepository;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import com.example.gdg2022backend.domain.survey.repository.SurveyRepository;
import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class SurveyService {

    private final MemberRepository memberRepository;
    private final SurveyRepository surveyRepository;

    @Transactional
    public void save(final Long memberId, final String q1, final String q2, final String q3, final String q4, final String q5, final String q6, final String q7, final String q8, final String q9, final String q10, final String q11) {
        final Member member = memberRepository.findById(memberId).orElseThrow();
        final Survey survey = surveyRepository.save(new Survey(member, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11));

        member.updateSurvey(survey);
    }

    public Survey findByMemberId(final Long memberId) {
        final Member member = memberRepository.findById(memberId).orElseThrow();
        return member.getSurvey();
    }
}
