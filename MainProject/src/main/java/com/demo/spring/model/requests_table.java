package com.demo.spring.model;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class requests_table {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "isOpen")
    private boolean isOpen;

    @Column(name = "CREATED_AT")
    private Timestamp CREATED_AT;

    @Column(name = "CLOSED_AT")
    private Timestamp CLOSED_AT;

    @Column(name = "book_copy_id")
    private int book_copy_id;

    @Column(name = "user_id")
    private int user_id;
}