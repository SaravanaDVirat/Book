package com.springboot.repository;

import com.springboot.entity.books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<books,Long>{
}