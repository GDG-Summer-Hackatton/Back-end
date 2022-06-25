package com.example.gdg2022backend.domain.chicken.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
@RequiredArgsConstructor
public class ChickenNativeQuery {

    private JdbcTemplate jdbcTemplate;



    public void test(final Double score) {
        String getMatchingChickenQuery = "select chicken_id, chicken.brand, chicken.name, chicken.description\n" +
                "from chick2.chicken\n" +
                "where (chicken.a1 + chicken.a2 + chicken.a3 + chicken.b1 + chicken.b2 + chicken.b3 + chicken.b4 +\n" +
                "       chicken.c1 + chicken.c2 + chicken.c3 + chicken.c4 + chicken.d1 + chicken.d2)  > ?\n" +
                "group by chicken_id\n" +
                "Order By rand()\n" +
                "limit 10\n";
    }


}
