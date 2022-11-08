package com.project.conductor.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "conductores")
public class Conductor {
	
	@Id
	private int id;

	private String nombre;

	private String fecha_ingreso;


	public Conductor(){

	}

	public Conductor(int id, String nombre, String fecha_ingreso) {
		this.id = id;
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
}