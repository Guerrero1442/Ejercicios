package co.edu.poli.examen1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.poli.examen1.model.Estado;
import co.edu.poli.examen1.model.Query2;


public interface EstadoRepository extends JpaRepository<Estado, String>{
	
	@Query(value=" SELECT facebook_url as UrlFacebook,SUM(population) as Population FROM estados group by facebook_url", nativeQuery = true)
	List<Query2> sumPoblation();

	@Query(value="SELECT * FROM estados as e JOIN gobernadores as g on g.id = e.gobernador_id where partido = ?1",nativeQuery=true)
	List<Estado> queryEstadoByPartidoGobernador(String t);
}
