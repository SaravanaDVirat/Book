package com.springboot.service;

import com.springboot.entity.books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BooksService {
    List<books> getAllBooks();

    books getBookid(Long bookid);
    books addBooks(books book);

    books updateBooks(books book,Long bookid);

    String deleteBooks(Long bookid);
}