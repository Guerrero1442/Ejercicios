package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Cd;
import com.example.library.repository.CdRepository;

@RestController
@RequestMapping("/api/v1")
public class CdController {
	
	@Autowired
	private CdRepository cdRepository;

	//? Ver todos los cds
	@GetMapping("/cd")
	public List<Cd> getCds() {
		return cdRepository.findAll();
	}

	//? Ver autor por ID
	@GetMapping("/cd/{CdId}")
	public Cd getCd(@PathVariable int CdId){
		Cd c = cdRepository.findById(CdId).get();
		return c;
	}

	//? Publicar cd
	@PostMapping("/cd")
	public Cd saveCd (@RequestBody Cd cd){
		cdRepository.save(cd);
		return cd;
	}

	//? Publicar varios cds
	@PostMapping("/cds")
	public List<Cd> saveCds(@RequestBody List<Cd> CdsList){
		cdRepository.saveAll(CdsList);
		return CdsList;
	}

	//? Actualizar cds
	@PutMapping("/cd/{CdId}")
	public Cd putCd(@PathVariable int CdId, @RequestBody Cd cd){
		Cd c = cdRepository.findById(CdId).get();

		c.setDuracion(cd.getDuracion());
		c.setFecha_creacion(cd.getFecha_creacion());

		cdRepository.save(c);
		return c;
	}

	//? Borrar cd
	@DeleteMapping("/cd/{CdId}")
	public Cd deleteCd(@PathVariable int CdId){
		Cd c = cdRepository.findById(CdId).get();
		cdRepository.deleteById(CdId);

		return c;
	}
}
