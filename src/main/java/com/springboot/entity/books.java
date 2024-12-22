package com.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "books" )
public class books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookid")
    public Long bookid;
    @Column(name = "bookname")
    public String bookname;
    @Column(name = "bookauthor")
    public String bookauthor;
    @Column(name = "price")
    public Long price;

    public Long getBookid()
    {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }
    public String getBookname()
    {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor()
    {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Long getPrice()
    {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
