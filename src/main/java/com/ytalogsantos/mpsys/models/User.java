package com.ytalogsantos.mpsys.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private boolean active;

    @OneToOne(mappedBy = "userId")
    private Account account;
}
