package com.example.demo.builder;

import com.example.demo.vo.BookVO;

import java.util.List;

/**
 * Created by KAI on 8/12/17.
 */
public final class BookVOBuilder {
    private Integer id;
    private String name;
    private List<String> authorsName;

    private BookVOBuilder() {
    }

    public static BookVOBuilder aBookVO() {
        return new BookVOBuilder();
    }

    public BookVOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BookVOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BookVOBuilder withAuthorsName(List<String> authorsName) {
        this.authorsName = authorsName;
        return this;
    }

    public BookVO build() {
        BookVO bookVO = new BookVO();
        bookVO.setId(id);
        bookVO.setName(name);
        bookVO.setAuthorsName(authorsName);
        return bookVO;
    }
}
