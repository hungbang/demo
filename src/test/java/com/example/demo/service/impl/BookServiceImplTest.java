package com.example.demo.service.impl;

import com.example.demo.DemoApplication;
import com.example.demo.builder.BookBuilder;
import com.example.demo.builder.BookVOBuilder;
import com.example.demo.entity.Authors;
import com.example.demo.entity.BookAuthors;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import com.example.demo.vo.BookVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

/**
 * Created by KAI on 8/12/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class BookServiceImplTest {

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService bookService = new BookServiceImpl();
    int i;

    @Before
    public void setUp() throws Exception {
        i = 1;
        BookAuthors bookAuthors = new BookAuthors();
        BookAuthors bookAuthors1 = new BookAuthors();
        BookAuthors bookAuthors2 = new BookAuthors();
        Authors authors = new Authors();
        authors.setName("Authors 1");
        Authors authors1 = new Authors();
        authors1.setName("Authors 2");
        Authors authors2 = new Authors();
        authors2.setName("Authors 3");
        bookAuthors.setAuthors(authors);
        bookAuthors1.setAuthors(authors1);
        bookAuthors2.setAuthors(authors2);
        when(bookRepository.findOne(i)).thenReturn(BookBuilder.aBook()
        .withId(1)
        .withName("Book 1")
        .withBookAuthors(Arrays.asList(bookAuthors, bookAuthors1, bookAuthors2)).build());
    }

    @Test
    public void getBook() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonExpected = objectMapper.writeValueAsString(BookVOBuilder.aBookVO().withId(1)
                .withName("Book 1")
                .withAuthorsName(Arrays.asList("Authors 1", "Authors 2", "Authors 3"))
                .build());
        BookVO book = bookService.getBook(i);
        String jsonRespone = objectMapper.writeValueAsString(book);
        Assert.assertEquals(jsonExpected, jsonRespone);

    }

}