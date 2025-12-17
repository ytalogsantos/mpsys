package com.ytalogsantos.mpsys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Operator extends Account {
    @OneToMany(mappedBy = "operatorId")
    private List<MaintenanceNote> maintenanceNotes;
}
