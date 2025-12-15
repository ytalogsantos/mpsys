package com.ytalogsantos.mpsys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Operator extends Account {
    @OneToMany(mappedBy = "operatorId")
    private MaintenanceNote maintenanceNote;
}
