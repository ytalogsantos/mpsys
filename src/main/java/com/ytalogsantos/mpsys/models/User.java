package com.ytalogsantos.mpsys.models;


import com.ytalogsantos.mpsys.models.enums.AccountType;
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
    private AccountType type;
    private boolean active;

    @OneToOne(mappedBy = "userId")
    private Gatekeeper gatekeeper; // TODO implement account type verification
}
