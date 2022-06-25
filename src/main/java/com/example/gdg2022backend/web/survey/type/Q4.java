package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q4 {
    A1("닭 날"),
    A2("닭"),
    A3("닭 다리"),
    A4("넓적다리"),
    A5("닭 가슴"),
    A6("닭 안심"),
    A7("닭 엉치"),
    A8("통닭"),
    A9("상관없음");
    private final String description;
}