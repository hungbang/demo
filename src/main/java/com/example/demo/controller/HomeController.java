package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by KAI on 8/11/17.
 */
@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping("getBook/{id}")
    @ResponseBody
    public ResponseEntity<BookVO> getBook(@PathVariable("id") Integer id) {
        BookVO bookVO = bookService.getBook(id);
        return ResponseEntity.ok().body(bookVO);
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }
}
