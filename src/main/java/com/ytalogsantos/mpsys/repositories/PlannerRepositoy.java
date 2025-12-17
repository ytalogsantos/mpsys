package com.ytalogsantos.mpsys.repositories;

import com.ytalogsantos.mpsys.models.Planner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannerRepositoy extends JpaRepository<Planner, Long> {
}
