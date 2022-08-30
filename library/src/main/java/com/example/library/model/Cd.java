package com.example.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Cds")
public class Cd {
	
	@Id
	private int id;

	private String duracion;
	private String fecha_creacion;
	
	@OneToOne
	@JoinColumn(name = "book_id", unique = true)
	private Book book;

	public Cd(){

	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Cd(int id, String duracion, String fecha_creacion) {
		this.id = id;
		this.duracion = duracion;
		this.fecha_creacion = fecha_creacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
}
