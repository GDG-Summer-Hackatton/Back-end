package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q2 {
    A1("뼈 치킨"),
    A2("순살 치킨"),
    A3("상관없음");
    private final String description;
}