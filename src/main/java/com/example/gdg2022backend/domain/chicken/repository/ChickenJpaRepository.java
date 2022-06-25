package com.example.gdg2022backend.domain.chicken.repository;

import com.example.gdg2022backend.domain.analysis.service.dto.MatchingChickenResult;
import com.example.gdg2022backend.domain.analysis.service.dto.SurveyResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ChickenJpaRepository {
    private final EntityManager em;

    public List<MatchingChickenResult> matchingChicken(SurveyResult surveyResult) {
        String sql = "(select chicken_id as chicken_id, brand as brand, name as name, description as description, sum as score from (\n" +
                "select chicken_id, chicken.brand, chicken.name, chicken.description,\n" +
                "       (chicken.a1 + chicken.a2 + chicken.a3 + chicken.b1 + chicken.b2 + chicken.b3 + chicken.b4 +\n" +
                "       chicken.c1 + chicken.c2 + chicken.c3 + chicken.c4 + chicken.d1 + chicken.d2) as sum\n" +
                "from chicken) as data1\n" +
                "where sum > ?\n" +
                "order by sum asc\n" +
                "limit 5)\n" +
                "UNION\n" +
                "(select chicken_id as chicken_id, brand as brand, name as name, description as description, sum as score from (\n" +
                "select chicken_id, chicken.brand, chicken.name, chicken.description,\n" +
                "       (chicken.a1 + chicken.a2 + chicken.a3 + chicken.b1 + chicken.b2 + chicken.b3 + chicken.b4 +\n" +
                "       chicken.c1 + chicken.c2 + chicken.c3 + chicken.c4 + chicken.d1 + chicken.d2) as sum\n" +
                "from chicken) as data1\n" +
                "where sum < ?\n" +
                "order by sum desc\n" +
                "limit 5)";

        Query nativeQuery = em.createNativeQuery(sql).setParameter(surveyResult.sum(), surveyResult.sum());
        return nativeQuery.getResultList();
    }
}


