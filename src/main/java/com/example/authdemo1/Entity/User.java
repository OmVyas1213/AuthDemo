package com.example.authdemo1.Entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // "user" is reserved in PostgreSQL
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}

