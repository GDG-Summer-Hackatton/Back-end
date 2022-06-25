package com.example.gdg2022backend.domain.chicken.service;

import com.example.gdg2022backend.domain.chicken.entity.Chicken;
import com.example.gdg2022backend.domain.chicken.repository.ChickenRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ChickenService {

	private final ChickenRepository chickenRepository;

	public List<Chicken> findAll() {
		return chickenRepository.findAll();
	}
}
