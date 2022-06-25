package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q1 {
	A1("기본치킨"),
	A2("양념치킨"),
	A3("상관없음");
	private final String description;

	public static Q1 from(final String description) {
		return Arrays.stream(Q1.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
