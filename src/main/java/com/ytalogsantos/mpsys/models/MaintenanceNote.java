package com.ytalogsantos.mpsys.models;

import com.ytalogsantos.mpsys.models.enums.NotePriority;
import com.ytalogsantos.mpsys.models.enums.NoteStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MaintenanceNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private NotePriority priority;
    private NoteStatus status;
    private String title;
    private String description;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "OperatorId")
    private Operator operatorId;

}
