package com.demo.spring.model;

import com.demo.spring.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="user_table")
public class User_table {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(columnDefinition = "varchar(45) default 'reader'", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "firstName", nullable = false)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your first name")
    private String firstName;

    @Column(name = "lastName", nullable = false)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your last name")
    private String lastName;

    @Column
    @Type(type="birthDate")
    private Date birthDate;

    @Column(name = "email", unique = true, nullable = false)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message="Please Enter your email")
    private String email;

    @Column(name = "password", nullable = false)
    @NotEmpty(message = "Please Enter your password")
    private String password;

    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
    private Timestamp CREATED_AT;

    @Column(name = "CLOSED_AT")
    private Timestamp CLOSED_AT;

    @Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
    private boolean is_deleted;

}