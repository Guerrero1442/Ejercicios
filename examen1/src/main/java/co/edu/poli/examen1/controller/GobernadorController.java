package co.edu.poli.examen1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.examen1.model.Gobernador;
import co.edu.poli.examen1.repository.GobernadorRepository;

@RestController
@RequestMapping("/api/v1")
public class GobernadorController {
	
	@Autowired
	private GobernadorRepository gobernadorRepository;

	@PostMapping("/gobernadores")
	public List<Gobernador> saveGobernadores(@RequestBody List<Gobernador> gobernadoresList){
		gobernadorRepository.saveAll(gobernadoresList);
		return gobernadoresList;
	}

	@GetMapping("/gobernadorP/{p}")
	public List<Gobernador> getGobernadorPartido(@PathVariable String p){
		return gobernadorRepository.filterByPartido(p);
	}
}
