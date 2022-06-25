package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q2 {
	A1("뼈 치킨"),
	A2("순살 치킨"),
	A3("상관없음");
	private final String description;

	public static Q2 from(final String description) {
		return Arrays.stream(Q2.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
