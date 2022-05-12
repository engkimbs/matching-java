package com.engkimbs.app.book.controller;

import com.engkimbs.domain.book.BookId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class BookController {

    @Autowired
    private Repository<BookId, Books> repository;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<BooksDto> getByBookId(@PathVariable("bookId")String bookId) {
        Optional.ofNullable(repository.find(BookId(bookId)))
        return ResponseEntity.of();
    }
}
