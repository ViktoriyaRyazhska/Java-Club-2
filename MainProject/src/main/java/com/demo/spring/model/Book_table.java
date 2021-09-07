package com.demo.spring.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "book_table")
public class Book_table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "publicationYear", nullable = false)
    private Integer year;

    @Column(name = "CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;

    @ManyToMany(mappedBy = "books")
    private List<Author_table> authors;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    @NotNull
    public Genre_table genre;
}