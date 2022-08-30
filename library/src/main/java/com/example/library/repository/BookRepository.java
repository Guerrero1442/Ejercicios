package com.example.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.library.model.Book;
import com.example.library.model.Query1;
import com.example.library.model.Query2;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//SQL
	@Query(value="SELECT * FROM Libros WHERE name LIKE %?1%", nativeQuery = true)
	List<Book> filterLetterTitle(String t);
	
	//? Consultas con GroupQuery 

	//JPQL
	@Query("SELECT new com.example.library.model.Query1(genre, count(genre)) FROM Book group by genre")
	List<Query1> groupGenre();

	//SQL
	@Query(value="SELECT l.genre as genre, count(l.genre) as cantidad FROM Libros as l group by l.genre", nativeQuery=true)
	List<Query2> groupGenre2();
}
