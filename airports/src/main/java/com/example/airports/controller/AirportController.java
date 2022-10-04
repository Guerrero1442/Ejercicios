package com.example.airports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airports.model.Airport;
import com.example.airports.repository.AirportRepository;

import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api(tags = {"Class: AirportController"})
@RestController
@RequestMapping("/api/v1/")
public class AirportController {
	
	@Autowired
	AirportRepository airportRepository;

	@GetMapping("/Airports")
	public List<Airport> getAllAirports(){
		return airportRepository.findAll();
	}

	@PostMapping("/Airports")
	public List<Airport> saveListAirports(@RequestBody List<Airport> airports) {
		return airportRepository.saveAll(airports);
	}

	@GetMapping("/AirportsQ1/{countryName}")
	public List<Airport> findAirports2(@PathVariable String countryName){
		return airportRepository.findAirportByCountryName(countryName);
	}

	@GetMapping("/AirportsQ2/{letter}")
	public List<Airport> findAirports1(@PathVariable String letter){
		return airportRepository.findAirportByLetters(letter);
	}


	@GetMapping("/AirportsQ3/{regionName}/{UTC}")
	public List<Airport> findAirport3(@PathVariable String regionName,@PathVariable int UTC){
		return airportRepository.findAirportsByRegionHorario(regionName, UTC);
	}

	@GetMapping("/AirportQ4/{min}/{max}")
	public List<Airport> findAirport4(@PathVariable double min, @PathVariable double max){
		return airportRepository.findAirportByRangeElevationFeet(min, max);
	}

	@GetMapping("/AirportQ5/{clasificacion}")
	public List<Airport> findAirport5(@PathVariable int clasificacion){
		return airportRepository.findAirportByClasificacion(clasificacion);
	}

}