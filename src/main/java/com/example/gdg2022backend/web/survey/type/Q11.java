package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q11 {
    A1("냉장"),
    A2("냉동"),
    A3("상관없음");
    private final String description;
}