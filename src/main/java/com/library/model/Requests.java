package com.library.model;

import javax.persistence.*;
import java.time.Instant;

//TODO add defaults
//TODO toString override
//TODO NotEmpty messages

@Table(name = "requests")
@Entity
public class Requests {

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

    @Column(name = "isOpen", nullable = false)
    private Boolean isOpen = false;

    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    @Column(name = "CLOSED_AT")
    private Instant closedAt;

    @Column(name = "accepted")
    private Boolean accepted;

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Instant getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Instant closedAt) {
        this.closedAt = closedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
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
