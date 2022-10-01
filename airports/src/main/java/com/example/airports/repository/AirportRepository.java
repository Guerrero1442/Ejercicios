package com.example.airports.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.airports.model.Airport;


public interface AirportRepository extends MongoRepository<Airport, String> {

	// @Query(value="{ 'regionName' : ?0, $lt: ?1  }", fields="{'name' : 1, 'city' : 1}")
	// List<Airport> findAirportByRegionName()

	@Query("{name: /.*?0.*/ }")
	List<Airport> findAirportByLetters(String name);


	@Query("{countryName: ?0}")
	List<Airport> findAirportByCountryName(String nameCountry);

	@Query(value = "{ $or : [ { regionName : ?0}, {utcOffsetHours : { $lt : ?1}  } ] }", fields = "{'name': 1, 'city': 1, '_id': 0}")
	List<Airport> findAirportsByRegionHorario(String nameRegion, int utc);

}
