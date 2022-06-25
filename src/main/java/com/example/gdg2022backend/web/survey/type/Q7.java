package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q7 {
    A1("부어 먹기"),
    A2("찍어 먹기"),
    A3("상관없음");
    private final String description;
}