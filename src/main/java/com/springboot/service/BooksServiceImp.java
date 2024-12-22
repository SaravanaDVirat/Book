package com.springboot.service;

import com.springboot.entity.books;
import com.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImp implements BooksService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<books> getAllBooks() {
        return (List<books>) bookRepository.findAll() ;
    }

    @Override
    public books getBookid(Long bookid) {
        return bookRepository.findById(bookid).get();
    }

    @Override
    public books addBooks(books book) {
        return bookRepository.save(book);
    }

    @Override
    public books updateBooks(books book,Long bookid) {
        books bookObj=bookRepository.findById(bookid).get();
        if(bookObj!=null)
        {
            bookObj.setBookname(book.getBookname());
            bookObj.setBookauthor(book.getBookauthor());
            bookObj.setPrice(book.getPrice());

        }
        return bookRepository.save(bookObj);
    }

    @Override
    public String deleteBooks(Long bookid) {
        books bookObj=bookRepository.findById(bookid).get();
        if(bookObj!=null)
        {
            bookRepository.delete(bookObj);

        }
        return "book is deleted successfully!" +bookid;
    }
}
