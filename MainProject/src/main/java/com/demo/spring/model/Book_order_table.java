package com.demo.spring.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="book_order_table")
public class Book_order_table {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp CREATED_AT;

    @Column(name = "CLOSED_AT")
    private Timestamp CLOSED_AT;

    @Column(name = "UPDATED_AT")
    private Timestamp UPDATED_AT;

    @Column(name = "RETURN_AT")
    private Timestamp RETURN_AT;

    @OneToOne @JoinColumn (name = "book_copy_id", referencedColumnName = "id")
    private Book_copy_table book_copy_id;

    @OneToOne @JoinColumn (name = "user_id", referencedColumnName = "id")
    private User_table user_id;
}
