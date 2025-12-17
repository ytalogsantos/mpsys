package com.ytalogsantos.mpsys.repositories;

import com.ytalogsantos.mpsys.models.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long> {
}
