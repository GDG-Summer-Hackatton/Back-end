package com.example.gdg2022backend.domain.survey.service;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.repository.MemberRepository;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import com.example.gdg2022backend.domain.survey.repository.SurveyRepository;
import com.example.gdg2022backend.web.survey.request.SurveyAddReqeust;
import com.example.gdg2022backend.web.survey.type.*;
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
    public void save(final Long memberId, final Q1 q1, final Q2 q2, final Q3 q3, final Q4 q4, final Q5 q5, final Q6 q6, final Q7 q7, final Q8 q8, final Q9 q9, final Q10 q10, final Q11 q11, String q12) {
        final Member member = memberRepository.findById(memberId).orElseThrow();
        final Survey survey = surveyRepository.save(new Survey(member, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12));

        member.updateSurvey(survey);
    }

    public Survey findByMemberId(final Long memberId) {
        final Member member = memberRepository.findById(memberId).orElseThrow();
        return member.getSurvey();
    }
}
