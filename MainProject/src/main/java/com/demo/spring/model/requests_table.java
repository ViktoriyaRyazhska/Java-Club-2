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

//    @OneToOne @JoinColumn (name = "book_copy_id", referencedColumnName = "id")
//    private book_copy_table book_copy_id;

//    @OneToOne @JoinColumn (name = "user_id", referencedColumnName = "id")
//    private user_table user_id;
}