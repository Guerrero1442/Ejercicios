package co.edu.poli.examen1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.poli.examen1.model.Estado;
import co.edu.poli.examen1.model.Gobernador;
import co.edu.poli.examen1.model.Query2;
import co.edu.poli.examen1.repository.EstadoRepository;
import co.edu.poli.examen1.repository.GobernadorRepository;

@RestController
@RequestMapping("/api/v1")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired GobernadorRepository gobernadorRepository;

	@GetMapping("/estado")
	public List<Estado> getEstados(){
		return estadoRepository.findAll();
	}

	@PostMapping("/estados")
	public List<Estado> postEstados(@RequestBody List<Estado> estadosList){
		estadoRepository.saveAll(estadosList);
		return estadosList;
	}

	
	@PutMapping("/cds/{idE}/{idG}")
	public Estado union(@PathVariable String idE, @PathVariable Integer idG) {
		Estado estado = estadoRepository.findById(idE).get();
		Gobernador gobernador =  gobernadorRepository.findById(idG).get();
			
		estado.setGobernador(gobernador);
					
		estadoRepository.save(estado);
		return estado;
	}

	@GetMapping("/estadoSum")
	public List<Query2> getSumPoblation(){
		return estadoRepository.sumPoblation();
	}

	@GetMapping("/estadoGober/{t}")
	public List<Estado> getGobernadorPartido(@PathVariable String t){
		return estadoRepository.queryEstadoByPartidoGobernador(t);
	}
}
