package com.library.model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

//TODO add defaults
//TODO toString override
//TODO NotEmpty messages

@Table(name = "orders")
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_copy_id", nullable = false)
    private Books_copies bookCopy;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "request_id", nullable = false)
    private Requests request;

    @Column(name = "GIVEN_AT", nullable = false)
    private Instant givenAt;

    @Column(name = "RETURNED_AT")
    private Instant returnedAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private Instant updatedAt;

    @Column(name = "RETURN_AT", nullable = false)
    private LocalDate returnAt;

    public LocalDate getReturnAt() {
        return returnAt;
    }

    public void setReturnAt(LocalDate returnAt) {
        this.returnAt = returnAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(Instant returnedAt) {
        this.returnedAt = returnedAt;
    }

    public Instant getGivenAt() {
        return givenAt;
    }

    public void setGivenAt(Instant givenAt) {
        this.givenAt = givenAt;
    }

    public Requests getRequest() {
        return request;
    }

    public void setRequest(Requests request) {
        this.request = request;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Books_copies getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(Books_copies bookCopy) {
        this.bookCopy = bookCopy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
