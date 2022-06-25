package com.example.gdg2022backend.web.survey.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Q1 {
    A1("기본치킨"),
    A2("양념치킨"),
    A3("상관없음");
    private final String description;
}