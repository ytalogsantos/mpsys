package com.ytalogsantos.mpsys.models.enums;

import lombok.Getter;

@Getter
public enum NoteStatus {
    OPEN("open"),
    PLANNING("planning"),
    PROGRAMMING("programming"),
    CLOSED("closed");

    private String status;

    NoteStatus(String status) {
        this.status = status;
    }
}
