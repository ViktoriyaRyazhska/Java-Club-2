package com.library.model;

import com.library.model.enums.Status;

//TODO add defaults
//TODO toString override
//TODO NotEmpty messages

import javax.persistence.*;

@Table(name = "books_copies")
@Entity
public class Books_copies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Id
    @Column(name = "book_id", nullable = false)
    private Integer id1;

    @Lob
    @Column(name = "book_status", nullable = false)
    private Status bookStatus;

    public Status getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Status bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
