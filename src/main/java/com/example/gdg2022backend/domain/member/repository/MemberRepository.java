package com.example.gdg2022backend.domain.member.repository;

import com.example.gdg2022backend.domain.member.entity.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	Optional<Member> findByEmailAndPassword(final String email, final String password);
}
