package com.example.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Libros")
public class Book {
	
	//? Primer paso: Crear un objeto con sus atributes, constructor y getters and setters.
	@Id
	private int id;

	private String name;
	private String genre;
	private String publisher;

	@OneToOne
	@JoinColumn(name="cd_id", unique = true)
	private Cd cd;

	@ManyToOne
	@JoinColumn(name = "author_id")
	@JsonIgnore
	private Author author;

	public Book(){

	}

	public Book(int id, String name, String genre, String publisher) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Cd getCd() {
		return cd;
	}

	public void setCd(Cd cd) {
		this.cd = cd;
	}
}
