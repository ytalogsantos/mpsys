package com.ytalogsantos.mpsys.models;

import jakarta.persistence.*;

@Entity
public class Gatekeeper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "UserId")
    private User userId;
    private String name;
    private String profilePicture;

}
