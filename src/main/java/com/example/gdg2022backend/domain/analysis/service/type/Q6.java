package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q6 {
	A1("로스트"),
	A2("베이크"),
	A3("훈제"),
	A4("상관없음");
	private final String description;

	public static Q6 from(final String description) {
		return Arrays.stream(Q6.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
