package com.ytalogsantos.mpsys.repositories;

import com.sun.tools.javac.Main;
import com.ytalogsantos.mpsys.models.MaintenanceNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceNoteRepository extends JpaRepository<MaintenanceNote, Long> {
}
