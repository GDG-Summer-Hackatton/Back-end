package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q9 {
	A1("Lv.1"),
	A2("Lv.2"),
	A3("Lv.3"),
	A4("Lv.4"),
	A5("Lv.5"),
	A6("상관없음");
	private final String description;

	public static Q9 from(final String description) {
		return Arrays.stream(Q9.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
