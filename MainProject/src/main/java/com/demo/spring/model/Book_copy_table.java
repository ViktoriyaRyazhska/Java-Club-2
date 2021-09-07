package com.demo.spring.model;

import com.demo.spring.enums.Status;

import javax.persistence.*;

@Entity
@Table(name="book_copy_table")
public class Book_copy_table {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book_table book_table;
}
