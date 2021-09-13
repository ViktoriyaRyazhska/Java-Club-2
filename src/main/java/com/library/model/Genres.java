package com.library.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//TODO add defaults
//TODO toString override
//TODO NotEmpty messages

@Table(name = "genres")
@Entity
public class Genres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "genre", nullable = false, length = 48)
    private String genre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "genres_books",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Books> books = new HashSet<>();

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}
