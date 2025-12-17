package com.ytalogsantos.mpsys.repositories;

import com.ytalogsantos.mpsys.models.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepository extends JpaRepository<Programmer, Long> {
}
