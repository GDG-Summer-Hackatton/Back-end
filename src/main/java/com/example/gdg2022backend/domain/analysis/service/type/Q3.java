package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q3 {
	A1("튀긴 치킨"),
	A2("구운 치킨"),
	A3("상관없음");
	private final String description;

	public static Q3 from(final String description) {
		return Arrays.stream(Q3.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
