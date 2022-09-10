package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booktests")
public class BooksTestController {
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save====>"+book);
        return  "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getall(){
        List<Book> booklist = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setDescription("小试牛刀");
        book1.setName("springmvc入门教程");
        book1.setType("计算机");
        booklist.add(book1);
        Book book2 = new Book();
        book2.setDescription("小试牛刀");
        book2.setName("springmvc入门教程");
        book2.setType("计算机");
        booklist.add(book2);
        return booklist;
    }
}
