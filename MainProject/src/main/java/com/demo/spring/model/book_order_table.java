package com.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class book_order_table {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "CREATED_AT")
    private Timestamp CREATED_AT;

    @Column(name = "CLOSED_AT")
    private Timestamp CLOSED_AT;

    @Column(name = "UPDATED_AT")
    private Timestamp UPDATED_AT;

    @Column(name = "RETURN_AT")
    private Timestamp RETURN_AT;

//    @OneToOne @JoinColumn (name = "book_copy_id", referencedColumnName = "id")
//    private book_copy_table book_copy_id;

//    @OneToOne @JoinColumn (name = "user_id", referencedColumnName = "id")
//    private user_table user_id;
}
