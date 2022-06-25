package com.example.gdg2022backend.web.survey.request;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurveyAddReqeust {

    private Long memberId;
    private Q1 q1;
    private Q2 q2;
    private Q3 q3;
    private Q4 q4;
    private Q5 q5;
    private Q6 q6;
    private Q7 q7;
    private Q8 q8;
    private Q9 q9;
    private Q10 q10;
    private Q11 q11;
	private String Q12;


    @Getter
    @RequiredArgsConstructor
    public enum Q1 {
        A1("기본치킨"),
        A2("양념치킨"),
        A3("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q2 {
        A1("뼈 치킨"),
        A2("순살 치킨"),
        A3("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q3 {
        A1("튀긴 치킨"),
        A2("구운 치킨"),
        A3("상관없음");
        private final String description;
    }

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


    @Getter
    @RequiredArgsConstructor
    public enum Q5 {
        A1("튀김 1세대(엠보싱 표면)"),
        A2("튀김 2세대(밋밋한 표면)"),
        A3("튀김 3세대(크리스피 표면)"),
        A4("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q6 {
        A1("로스트"),
        A2("베이크"),
        A3("훈제"),
        A4("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q7 {
        A1("부어 먹기"),
        A2("찍어 먹기"),
        A3("상관없음");
        private final String description;
    }

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

    @Getter
    @RequiredArgsConstructor
    public enum Q9 {
        A1("Lv.1"),
        A2("Lv.2"),
        A3("Lv.3"),
        A4("Lv.4"),
        A5("Lv.5"),
        A6("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q10 {
        A1("가성비"),
        A2("가심비"),
        A3("미식"),
        A4("상관없음");
        private final String description;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Q11 {
        A1("냉장"),
        A2("냉동"),
        A3("상관없음");
        private final String description;
    }
}
