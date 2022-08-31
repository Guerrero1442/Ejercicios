package co.edu.poli.examen1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.poli.examen1.model.Estado;
import co.edu.poli.examen1.model.Query2;


public interface EstadoRepository extends JpaRepository<Estado, String>{
	
	@Query(value="SELECT SUM(population) as populationFacebookURL FROM estados WHERE facebook_url IS NOT NULL", nativeQuery = true)
	List<Query2> sumPoblation();
}
