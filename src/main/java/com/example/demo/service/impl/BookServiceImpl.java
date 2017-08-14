package com.example.demo.service.impl;

import com.example.demo.builder.BookVOBuilder;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import com.example.demo.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Created by KAI on 8/11/17.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookVO getBook(int i) {
        try {
            Book book = bookRepository.findOne(i);
            return BookVOBuilder.aBookVO().withId(book.getId())
                    .withName(book.getName())
                    .withAuthorsName(book.getBookAuthors().stream()
                            .map(bookAuthors -> bookAuthors.getAuthors().getName())
                            .collect(Collectors.toList()))
                    .build();
        } catch (Exception e) {
            return null;
        }
    }
}
