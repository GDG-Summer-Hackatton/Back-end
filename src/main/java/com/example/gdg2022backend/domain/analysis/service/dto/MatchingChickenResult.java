package com.example.gdg2022backend.domain.analysis.service.dto;

import lombok.Data;

@Data
public class MatchingChickenResult {
    private String brand;
    private String name;
    private String description;
    private Double score;
}
