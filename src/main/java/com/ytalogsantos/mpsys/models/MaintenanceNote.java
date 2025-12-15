package com.ytalogsantos.mpsys.models;

import com.ytalogsantos.mpsys.models.enums.NotePriority;
import com.ytalogsantos.mpsys.models.enums.NoteStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
    // TODO create a sender entity (may not be necessary, we'll see later);
}
