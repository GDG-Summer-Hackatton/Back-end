package com.example.gdg2022backend.domain.survey.service;

import com.example.gdg2022backend.domain.member.entity.Member;
import com.example.gdg2022backend.domain.member.repository.MemberRepository;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import com.example.gdg2022backend.domain.survey.repository.SurveyRepository;
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
	public void save(final Long memberId, final String result) {
		final Member member = memberRepository.findById(memberId).orElseThrow();
		final Survey survey = surveyRepository.save(new Survey(member, result));

		member.updateSurvey(survey);
	}

	public Survey findByMemberId(final Long memberId) {
		final Member member = memberRepository.findById(memberId).orElseThrow();
		return member.getSurvey();
	}
}
