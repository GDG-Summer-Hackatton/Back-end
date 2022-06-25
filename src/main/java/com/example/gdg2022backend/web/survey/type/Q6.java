package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q6 {
    A1("로스트"),
    A2("베이크"),
    A3("훈제"),
    A4("상관없음");
    private final String description;
}