package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q3 {
    A1("튀긴 치킨"),
    A2("구운 치킨"),
    A3("상관없음");
    private final String description;
}