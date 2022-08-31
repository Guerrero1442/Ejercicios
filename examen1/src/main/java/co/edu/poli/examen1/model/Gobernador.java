package co.edu.poli.examen1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gobernadores")
public class Gobernador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String estado;
	private String nombre;
	private String partido;
	private String iniciomandato;

	public Gobernador(){
		
	}
	

	public Gobernador(int id, String estado, String nombre, String partido, String iniciomandato) {
		this.id = id;
		this.estado = estado;
		this.nombre = nombre;
		this.partido = partido;
		this.iniciomandato = iniciomandato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getIniciomandato() {
		return iniciomandato;
	}

	public void setIniciomandato(String iniciomandato) {
		this.iniciomandato = iniciomandato;
	}

	

}
