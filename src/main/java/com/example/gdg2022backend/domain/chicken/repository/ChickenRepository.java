package com.example.gdg2022backend.domain.chicken.repository;

import com.example.gdg2022backend.domain.chicken.entity.Chicken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChickenRepository extends JpaRepository<Chicken, Long> {

}
