package com.example.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//SQL
	@Query(value="SELECT * FROM Libros WHERE name LIKE %?1%", nativeQuery = true)
	List<Book> filterLetterTitle(String t);
	
}
