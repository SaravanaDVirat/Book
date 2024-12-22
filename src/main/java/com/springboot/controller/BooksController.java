package com.springboot.controller;

import com.springboot.entity.books;
import com.springboot.repository.BookRepository;
import com.springboot.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    private BookRepository bookRepository;

    @GetMapping("/books")
        public ResponseEntity<List<books>> getAllBooks()
        {
            return ResponseEntity.ok(booksService.getAllBooks());
        }

        @GetMapping("/books/{bookid}")

            public ResponseEntity<books> getBookid(@PathVariable("bookid") Long bookid)
            {
                return ResponseEntity.ok(booksService.getBookid(bookid));
            }

        @PostMapping("/books")
            public ResponseEntity<books> addBooks(@RequestBody books book)
            {
                return ResponseEntity.ok(booksService.addBooks(book));
            }

    @PatchMapping("/books/{bookid}")
    public ResponseEntity<books> updateBooks(@RequestBody books book, @PathVariable("bookid") Long bookid)
    {
        return ResponseEntity.ok(booksService.updateBooks(book,bookid));
    }

    @DeleteMapping("/books/{bookid}")

    public ResponseEntity<String> deleteBooks(@PathVariable("bookid") Long bookid)
    {
        return ResponseEntity.ok(booksService.deleteBooks(bookid));
    }
}
