package com.example.enverssample.domain.team.repository;

import com.example.enverssample.domain.team.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
