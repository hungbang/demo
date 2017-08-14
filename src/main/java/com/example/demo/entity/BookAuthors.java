package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by KAI on 8/11/17.
 */
@Entity
@Table(name = "book_authors")
public class BookAuthors {

    @EmbeddedId
    private BookAuthorsId bookAuthorsId;

    @ManyToOne
    @JoinColumn(name = "fk_book")
    @MapsId("bookId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "fk_authors")
    @MapsId("authorsId")
    private Authors authors;

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public BookAuthorsId getBookAuthorsId() {
        return bookAuthorsId;
    }

    public void setBookAuthorsId(BookAuthorsId bookAuthorsId) {
        this.bookAuthorsId = bookAuthorsId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
