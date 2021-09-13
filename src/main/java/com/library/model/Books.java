package com.library.model;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

//TODO add defaults
//TODO toString override
//TODO NotEmpty messages

@Table(name = "books")
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 128)
    private String title;

    @Column(name = "description", nullable = false, length = 512)
    private String description;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;

    @Column(name = "publicationYear", nullable = false)
    private Integer publicationYear;

    @Convert(disableConversion = true)
    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    @Convert(disableConversion = true)
    @Column(name = "UPDATED_AT", nullable = false)
    private Instant updatedAt;

    @Convert(disableConversion = true)
    @Column(name = "DELETED_AT")
    private Instant deletedAt;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Authors> authors = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "genres_books",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Genres> genres = new HashSet<>();

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Authors> authors) {
        this.authors = authors;
    }

    public Set<Genres> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genres> genres) {
        this.genres = genres;
    }
}
