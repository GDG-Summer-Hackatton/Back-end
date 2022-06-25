package com.example.gdg2022backend.web.survey.type;

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
}