package com.ytalogsantos.mpsys.models;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // TODO read about spring annotations
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String profilePicture;
    private Instant createdAt;

    @OneToOne
    @JoinColumn(name = "UserId")
    private User userId;

}