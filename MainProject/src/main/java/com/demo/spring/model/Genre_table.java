package com.demo.spring.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genre_table")
public class Genre_table {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "genre", nullable = false)
    private String genre;

    @OneToMany(mappedBy = "genre", cascade=CascadeType.PERSIST)
    private List<Book_table> books;
}