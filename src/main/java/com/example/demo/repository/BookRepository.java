package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 8/11/17.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
