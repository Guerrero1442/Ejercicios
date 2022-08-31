package co.edu.poli.examen1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.poli.examen1.model.Gobernador;

public interface GobernadorRepository extends JpaRepository<Gobernador, Integer>{
	
	//SQL busqueda gobernador por partido
	@Query(value="SELECT * FROM gobernadores WHERE partido=?1", nativeQuery=true)
	List<Gobernador> filterByPartido(String p);

}
