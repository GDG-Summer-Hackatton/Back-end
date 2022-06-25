package com.example.gdg2022backend.web.analysis.response;

import com.example.gdg2022backend.domain.analysis.service.dto.MatchingChickenResult;
import java.util.List;
import lombok.Data;

@Data
public class AnalysisResponse {

	private final List<MatchingChickenResult> chickens;
}
