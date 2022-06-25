package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q11 {
	A1("냉장"),
	A2("냉동"),
	A3("상관없음");
	private final String description;

	public static Q11 from(final String description) {
		return Arrays.stream(Q11.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
