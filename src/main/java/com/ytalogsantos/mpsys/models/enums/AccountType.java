package com.ytalogsantos.mpsys.models.enums;

import lombok.Getter;

@Getter
public enum AccountType {
    GATEKEEPER("gatekeeper"),
    PLANNER("planner"),
    PROGRAMMER("programmer");

    private String type;

    AccountType(String type) {
        this.type = type;
    }
}
