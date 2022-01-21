package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return new Book(id, id+"",id+"");
    }

    @GetMapping("/")
    public Page<Book> findBooks(Pageable pageable) {
        return new PageImpl<>(List.of(new Book(1L, "Dubliners", "James Joyce")), pageable, 100);
    }

}