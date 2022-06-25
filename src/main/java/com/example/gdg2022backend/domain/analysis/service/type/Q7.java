package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q7 {
	A1("부어 먹기"),
	A2("찍어 먹기"),
	A3("상관없음");
	private final String description;

	public static Q7 from(final String description) {
		return Arrays.stream(Q7.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
