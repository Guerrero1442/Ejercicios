package com.example.airports.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.airports.model.Airport;


public interface AirportRepository extends MongoRepository<Airport, String> {

	// Los datos correspondientes a los aeropuertos que corresponden exactamente a un nombre de país digitado por el usuario.
	@Query("{countryName: ?0}")
	List<Airport> findAirportByCountryName(String nameCountry);

	// El nombre y ciudad de los aeropuertos que esta dentro de un rango (definido por el usuario) en la elevación en pies.
	@Query(value = "{elevationFeet: { $gt: ?0, $lt: ?1}}", fields = "{'name': 1, 'city': 1, '_id': 0}")
	List<Airport> findAirportByRangeElevationFeet(double gt, double $lt);

	//  Aquellos aeropuertos que estan activos y su clasificación es superior a un número (digitado por el usuario).
	@Query("{ $and: [{ classification: {$gt: ?0} }, { active: true }]}")
	List<Airport> findAirportByClasificacion(int c);

	// Aquellos aeropuertos que corresponden a un substring (digitado por el usuario) que esta dentro del nombre de aeropuerto.
	@Query("{name: /.*?0.*/ }")
	List<Airport> findAirportByLetters(String name);

	// El nombre de aeropuerto y ciudad de aquellos aeropuertos que corresponden a un nombre de región (digitado por el usuario) o que esten por debajo de una hora UTC  - utcOffsetHours - (digitado por el usuario).
	@Query(value = "{ $or : [ { regionName : ?0}, {utcOffsetHours : { $lt : ?1}  } ] }", fields = "{'name': 1, 'city': 1, '_id': 0}")
	List<Airport> findAirportsByRegionHorario(String nameRegion, int utc);

}
