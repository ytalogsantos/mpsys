package com.ytalogsantos.mpsys.models.enums;

import lombok.Getter;

@Getter
public enum NotePriority {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private final String priority;

    NotePriority(String priority) {
        this.priority = priority;
    }

}
