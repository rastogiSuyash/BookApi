package com.Book.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Book.demo.Entity.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

}
