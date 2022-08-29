package com.example.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Cds")
public class Cd {
	
	@Id
	private int id;

	private int duracion;
	private int fecha_creacion;
	
	@OneToOne(mappedBy = "cd")
	@JsonIgnore
	private Book book;

	public Cd(){

	}

	public Cd(int id, int duracion, int fecha_creacion) {
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(int fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
}
