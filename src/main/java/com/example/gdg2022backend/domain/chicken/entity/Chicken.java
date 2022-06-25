package com.example.gdg2022backend.domain.chicken.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Chicken {

	@Id
	@Column(name = "chicken_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double a1; // 단조로운
	private Double a2; // 풍부한
	private Double a3; // 편리한
	private Double b1; // 부드러운
	private Double b2; // 바삭한
	private Double b3; // 쫄깃한
	private Double b4; // 퍽퍽한
	private Double c1; // 매운
	private Double c2; // 단
	private Double c3; // 짠
	private Double c4; // 신
	private Double d1; // 서비스
	private Double d2; // 품질
}
