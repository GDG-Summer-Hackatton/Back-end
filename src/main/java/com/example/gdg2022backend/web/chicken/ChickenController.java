package com.example.gdg2022backend.web.chicken;

import com.example.gdg2022backend.domain.chicken.entity.Chicken;
import com.example.gdg2022backend.domain.chicken.service.ChickenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "치킨")
@RequiredArgsConstructor
@RestController
public class ChickenController {

	private final ChickenService chickenService;

	@Operation(summary = "조회")
	@GetMapping("/chicken")
	public List<Chicken> login() {
		return chickenService.findAll();
	}
}
