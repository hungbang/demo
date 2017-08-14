package com.example.demo.repository;

import com.example.demo.entity.BookAuthors;
import com.example.demo.entity.BookAuthorsId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 8/12/17.
 */
public interface BookAuthorsRepository extends JpaRepository<BookAuthors, BookAuthorsId> {
}
