package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import com.example.library.model.Query1;
import com.example.library.model.Query2;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;

	//? Ver todos los libros
	@GetMapping("/Book")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	//? Ver autor por ID
	@GetMapping("/Book/{BookId}")
	public Book getBook(@PathVariable int BookId){
		Book b = bookRepository.findById(BookId).get();
		return b;
	}

	//? Publicar libro
	@PostMapping("/Book")
	public Book saveBook (@RequestBody Book book){
		bookRepository.save(book);
		return book;
	}

	//? Publicar varios libros
	@PostMapping("/Books")
	public List<Book> saveBooks(@RequestBody List<Book> BooksList){
		bookRepository.saveAll(BooksList);
		return BooksList;
	}

	//? Actualizar libros
	@PutMapping("/Book/{BookId}")
	public Book putBook(@PathVariable int BookId, @RequestBody Book book){
		Book b = bookRepository.findById(BookId).get();

		b.setName(book.getName());
		b.setGenre(book.getGenre());
		b.setPublisher(book.getPublisher());

		bookRepository.save(b);
		return b;
	}

	//? Borrar libro
	@DeleteMapping("/Book/{BookId}")
	public Book deleteBook(@PathVariable int BookId){
		Book b = bookRepository.findById(BookId).get();
		bookRepository.deleteById(BookId);

		return b;
	}

	//? Agregar consulta busqueda por letra en el titulo
	@GetMapping("/bookqlt/{t}")
	public List<Book> getBooksTitle(@PathVariable String t){
		return bookRepository.filterLetterTitle(t);
	}

	//? GroupQuery SQL buscar cantidad de generos
	@GetMapping("/bookgsql")
	public List<Query1> getGenerosQuery1(){
		return bookRepository.groupGenre();
	}

	//? GroupQuery JPA buscar cantidad de generos
	@GetMapping("/bookgjpa")
	public List<Query2> getGenerosQuery2(){
		return bookRepository.groupGenre2();
	}
}
