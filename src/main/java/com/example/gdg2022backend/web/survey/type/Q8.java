package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q8 {
    A1("매운"),
    A2("단"),
    A3("짠"),
    A4("신"),
    A5("상관없음");
    private final String description;
}