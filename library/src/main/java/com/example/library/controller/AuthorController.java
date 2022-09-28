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

import com.example.library.model.Author;
import com.example.library.repository.AuthorRepository;

import io.swagger.annotations.Api;

// @Api(tags = {"Class: AuthorController"})
@RestController
@RequestMapping("/api/v1")
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;

	//? Ver todos los autores
	@GetMapping("/author")
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}

	//? Ver autor por ID
	@GetMapping("/author/{authorId}")
	public Author getAuthor(@PathVariable int authorId){
		Author a = authorRepository.findById(authorId).get();
		return a;
	}

	//? Publicar autor
	@PostMapping("/author")
	public Author saveAuthor(@RequestBody Author author){
		authorRepository.save(author);
		return author;
	}

	//? Publicar varios autores
	@PostMapping("/authors")
	public List<Author> saveAuthors(@RequestBody List<Author> authorsList){
		authorRepository.saveAll(authorsList);
		return authorsList;
	}

	//? Actualizar autores
	@PutMapping("/author/{authorId}")
	public Author putAuthor(@PathVariable int authorId, @RequestBody Author author){
		Author a = authorRepository.findById(authorId).get();

		a.setName(author.getName());
		a.setNacionalidad(author.getNacionalidad());
		a.setEdad(author.getEdad());

		authorRepository.save(a);
		return a;
	}

	//? Borrar autor
	@DeleteMapping("/author/{authorId}")
	public Author deleteAuthor(@PathVariable int authorId){
		Author a = authorRepository.findById(authorId).get();
		authorRepository.deleteById(authorId);

		return a;
	}
}
