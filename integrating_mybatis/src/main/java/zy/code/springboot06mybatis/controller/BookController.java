package zy.code.springboot06mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zy.code.springboot06mybatis.domain.Book;
import zy.code.springboot06mybatis.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @GetMapping("/book/{id}")
    public Book findById(@PathVariable("id") int id){
        return bookService.findById(id);
    }
    @GetMapping("/book")
    public Book insert(Book book){
        bookService.insert(book);
        return book;
    }

//    @GetMapping("/book")
//    public void delete(Book book){
//        bookService.delete(book);
//    }
}
