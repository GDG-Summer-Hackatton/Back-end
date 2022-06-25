package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q5 {
	A1("튀김 1세대(엠보싱 표면)"),
	A2("튀김 2세대(밋밋한 표면)"),
	A3("튀김 3세대(크리스피 표면)"),
	A4("상관없음");
	private final String description;

	public static Q5 from(final String description) {
		return Arrays.stream(Q5.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
