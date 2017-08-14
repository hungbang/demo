package com.example.demo.builder;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookAuthors;

import java.util.List;

/**
 * Created by KAI on 8/12/17.
 */
public final class BookBuilder {
    private Integer id;
    private String name;
    private List<BookAuthors> bookAuthors;

    private int version;

    private BookBuilder() {
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BookBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder withBookAuthors(List<BookAuthors> bookAuthors) {
        this.bookAuthors = bookAuthors;
        return this;
    }

    public BookBuilder withVersion(int version) {
        this.version = version;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setBookAuthors(bookAuthors);
        book.setVersion(version);
        return book;
    }
}
