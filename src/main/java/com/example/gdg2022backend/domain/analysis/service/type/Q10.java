package com.example.gdg2022backend.domain.analysis.service.type;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q10 {
	A1("가성비"),
	A2("가심비"),
	A3("미식"),
	A4("상관없음");
	private final String description;

	public static Q10 from(final String description) {
		return Arrays.stream(Q10.values())
				.filter(e -> e.name().equals(description))
				.findFirst()
				.orElseThrow();
	}
}
