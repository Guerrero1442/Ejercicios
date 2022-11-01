package com.example.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.security.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	@Query ("FROM Book WHERE author = ?1")
	List<Book> findByAuthor (String aut);
}
