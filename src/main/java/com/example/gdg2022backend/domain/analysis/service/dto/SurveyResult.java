package com.example.gdg2022backend.domain.analysis.service.dto;

import com.example.gdg2022backend.domain.analysis.service.type.Q1;
import com.example.gdg2022backend.domain.analysis.service.type.Q10;
import com.example.gdg2022backend.domain.analysis.service.type.Q11;
import com.example.gdg2022backend.domain.analysis.service.type.Q2;
import com.example.gdg2022backend.domain.analysis.service.type.Q3;
import com.example.gdg2022backend.domain.analysis.service.type.Q4;
import com.example.gdg2022backend.domain.analysis.service.type.Q5;
import com.example.gdg2022backend.domain.analysis.service.type.Q6;
import com.example.gdg2022backend.domain.analysis.service.type.Q7;
import com.example.gdg2022backend.domain.analysis.service.type.Q8;
import com.example.gdg2022backend.domain.analysis.service.type.Q9;
import com.example.gdg2022backend.domain.survey.entity.Survey;
import lombok.Data;

@Data
public class SurveyResult {

	private Integer a1; // 단조로운
	private Integer a2; // 풍부한
	private Integer a3; // 편리한
	private Integer b1; // 부드러운
	private Integer b2; // 바삭한
	private Integer b3; // 쫄깃한
	private Integer b4; // 퍽퍽한
	private Integer c1; // 매운
	private Integer c2; // 단
	private Integer c3; // 짠
	private Integer c4; // 신
	private Integer d1; // 서비스
	private Integer d2; // 품질

	public SurveyResult(final Survey survey) {
		this.a1 = 0;
		this.a2 = 0;
		this.a3 = 0;
		this.b1 = 0;
		this.b2 = 0;
		this.b3 = 0;
		this.b4 = 0;
		this.c1 = 0;
		this.c2 = 0;
		this.c3 = 0;
		this.c4 = 0;
		this.d1 = 0;
		this.d2 = 0;

		switch (Q1.from(survey.getQ1())) {
			case A1:
				this.a1 += 5;
				this.a3 += 5;
				this.b2 += 5;
				break;
			case A2:
				this.a2 += 5;
				this.b1 += 5;
				break;
			case A3:
				break;
		}

		switch (Q2.from(survey.getQ2())) {
			case A1:
				this.a2 += 2;
				this.b2 += 5;
				break;
			case A2:
				this.a1 += 5;
				this.a3 += 5;
				break;
			case A3:
				break;
		}

		switch (Q3.from(survey.getQ3())) {
			case A1:
				this.a2 += 2;
				this.c3 += 5;
				this.b2 += 2;
				break;
			case A2:
				this.a1 += 2;
				this.b1 += 5;
				break;
			case A3:
				break;
		}

		switch (Q4.from(survey.getQ4())) {
			case A1:
				this.b1 += 5;
				this.b3 += 5;
				break;
			case A2:
				this.a3 += 5;
				this.b1 += 5;
				this.b3 += 3;
				break;
			case A3:
				this.a3 += 4;
				this.b1 += 5;
				this.b3 += 5;
				break;
			case A4:
				this.a3 += 5;
				this.b1 += 5;
				this.b3 += 5;
				break;
			case A5:
				this.a1 += 2;
				this.b1 += 5;
				break;
			case A6:
				this.a3 += 5;
				this.b4 += 5;
				break;
			case A7:
				this.a3 += 3;
				this.b1 += 3;
				this.b3 += 3;
				break;
			case A8:
				this.b3 += 3;
				this.b4 += 4;
				break;
			case A9:
				break;
		}

		switch (Q5.from(survey.getQ5())) {
			case A1:
				this.a2 += 5;
				this.b2 += 3;
				break;
			case A2:
				this.a2 += 3;
				this.b2 += 3;
				break;
			case A3:
				this.a2 += 3;
				this.b2 += 5;
			case A4:
				break;
		}

		switch (Q6.from(survey.getQ6())) {
			case A1:
				this.a2 += 3;
				this.b2 += 5;
				break;
			case A2:
				this.a2 += 5;
				this.b2 += 3;
				break;
			case A3:
				this.a2 += 5;
				this.b1 += 3;
				break;
			case A4:
				break;
		}

		switch (Q7.from(survey.getQ7())) {
			case A1:
				this.a2 += 5;
				this.a3 += 5;
				this.b1 += 3;
				break;
			case A2:
				this.a2 += 3;
				this.b2 += 3;
				break;
			case A3:
				break;
		}

		switch (Q8.from(survey.getQ8())) {
			case A1:
				this.c1 += 5;
				break;
			case A2:
				this.c2 += 5;
				break;
			case A3:
				this.c3 += 5;
				break;
			case A4:
				this.c4 += 5;
				break;
			case A5:
				break;
		}

		switch (Q9.from(survey.getQ9())) {
			case A1:
				this.c1 += 2;
				break;
			case A2:
				this.c1 += 4;
				break;
			case A3:
				this.c1 += 6;
				break;
			case A4:
				this.c1 += 8;
				break;
			case A5:
				this.c1 += 10;
				break;
			case A6:
				break;
		}

		// d1-1, d2-1	d1-3, d1-3	d1-5, d2-5
		switch (Q10.from(survey.getQ10())) {
			case A1:
				this.d1 += 1;
				this.d2 += 1;
				break;
			case A2:
				this.d1 += 3;
				this.d2 += 3;
				break;
			case A3:
				this.d1 += 5;
				this.d2 += 5;
				break;
			case A4:
				break;
		}

		switch (Q11.from(survey.getQ11())) {
			case A1:
				this.d1 += 5;
				this.d2 += 5;
				break;
			case A2:
				this.d1 += 1;
				this.d2 += 1;
				break;
			case A3:
				break;
		}
	}

	public Integer sum() {
		final int sum = a1 + a2 + a3 +
				b1 + b2 + b3 + b4 +
				c1 + c2 + c3 + c4 +
				d1 + d2;

		if (sum > 90 || sum < 10) {
			return 50;
		}

		return sum;
	}
}
