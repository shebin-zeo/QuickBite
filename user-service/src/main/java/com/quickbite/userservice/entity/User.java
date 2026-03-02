package com.quickbite.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;  //Keycloak id

    @Column(nullable = false)
    private String email;

    private String fullName;

    private String phone;

    private String address;

    private LocalDateTime createdAt;

}
