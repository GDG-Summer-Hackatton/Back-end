package com.example.gdg2022backend.domain.chicken.repository;

import com.example.gdg2022backend.domain.analysis.service.dto.MatchingChickenResult;
import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChickenJpaRepository {

	private final EntityManager em;

	public List<MatchingChickenResult> matchingChicken(SurveyResult surveyResult) {
		String sql = "(select chicken_id as chicken_id, brand as brand, name as name, description as description, sum as score from ( " +
				"select chicken_id, chicken.brand, chicken.name, chicken.description, " +
				"       (chicken.a1 + chicken.a2 + chicken.a3 + chicken.b1 + chicken.b2 + chicken.b3 + chicken.b4 + " +
				"       chicken.c1 + chicken.c2 + chicken.c3 + chicken.c4 + chicken.d1 + chicken.d2) as sum " +
				"from chicken) as data1 " +
				"where sum > ?1 " +
				"order by sum asc " +
				"limit 5) " +
				"UNION " +
				"(select chicken_id as chicken_id, brand as brand, name as name, description as description, sum as score from ( " +
				"select chicken_id, chicken.brand, chicken.name, chicken.description, " +
				"       (chicken.a1 + chicken.a2 + chicken.a3 + chicken.b1 + chicken.b2 + chicken.b3 + chicken.b4 + " +
				"       chicken.c1 + chicken.c2 + chicken.c3 + chicken.c4 + chicken.d1 + chicken.d2) as sum " +
				"from chicken) as data1 " +
				"where sum < ?2 " +
				"order by sum desc " +
				"limit 5)";

		Query nativeQuery = em.createNativeQuery(sql)
				.setParameter(1, surveyResult.sum())
				.setParameter(2, surveyResult.sum());
		return nativeQuery.getResultList();
	}
}


