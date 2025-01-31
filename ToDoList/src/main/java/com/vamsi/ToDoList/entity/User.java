package com.vamsi.ToDoList.entity;

import jakarta.persistence.*;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique=true)
    private String username;

    @Column(nullable=false)
    private String password;

    @ElementCollection(fetch=FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
