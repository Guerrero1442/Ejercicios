package com.example.nutrients.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutrients.model.Nutrient;
import com.example.nutrients.repository.NutrientRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PutMapping;


@Api(tags = {"Class: NutrientController"})
@RestController
@RequestMapping("/api/v1/")
public class NutrientController {
	
	@Autowired
	NutrientRepository nutrientRepository;

	@GetMapping("/Nutrients")
	@ApiOperation(value = "*** Service Method Get All Nutrients ***", notes = "*** Get All Customers from MongoDB\\\\WebApp ***")
	@ApiResponses(value = {@ApiResponse(code = 404, message = "*** Error Get All Customers!!! ***")})
	public List<Nutrient> getAllNutrients(){
		return nutrientRepository.findAll();
	}

	@GetMapping("/Nutrients/{id}")
	public Nutrient getNutrientByID(@PathVariable String id){
		return nutrientRepository.findById(id).get();
	}

	@PostMapping("/Nutrients")
	public Nutrient saveNutrient(@RequestBody Nutrient nutrient){
		return nutrientRepository.save(nutrient);
	}

	@PostMapping("/NutrientsList")
	public List<Nutrient> saveListNutrients(@RequestBody List<Nutrient> nutrients){
		return nutrientRepository.saveAll(nutrients);
	}

	@PutMapping("Nutrients/{id}")
	public Nutrient putNutrient(@PathVariable String id, @RequestBody Nutrient nutrient) {
		
		Nutrient _nutrient = nutrientRepository.findById(id).get();

		_nutrient.setName(nutrient.getName());
		_nutrient.setRda(nutrient.getRda());
		_nutrient.setRequired(nutrient.isRequired());
		_nutrient.setTui(nutrient.getTui());
		_nutrient.setType(nutrient.getType());
		_nutrient.setWiki(nutrient.getWiki());

		nutrientRepository.save(_nutrient);

		return _nutrient;
	}

	@DeleteMapping("/Nutrients/{id}")
	public Nutrient deleteCustomerById(@PathVariable String id) {
		Nutrient _nutrient = nutrientRepository.findById(id).get();
		nutrientRepository.deleteById(id);
		return _nutrient;
	}
	
	@DeleteMapping("/NutrientsList")
	public void deleteAll() {
		nutrientRepository.deleteAll();
	}

	@GetMapping("/NutrientsQ1/{tui}/{type}")
	public List<Nutrient> findNutrient1(@PathVariable int tui, @PathVariable String type){
		return nutrientRepository.findNutrientByTuiAndType(tui, type);
	}

	@GetMapping("/NutrientsQ2/{FirstLetter}/{LastLetter}")
	public List<Nutrient> findNutrient2(@PathVariable String FirstLetter, @PathVariable String LastLetter){
		return nutrientRepository.findNutrientByName(FirstLetter, LastLetter);
	}
}
