package com.example.nutrients.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.nutrients.model.Nutrient;

public interface NutrientRepository extends MongoRepository<Nutrient, String>{
	
	@Query(value = "{ $and: [{ tui: {$gt: ?0} }, { type:/.*?1.*/ }]}",fields = "{'name': 1, '_id': 0}")
	List<Nutrient> findNutrientByTuiAndType(int tui , String type);

	@Query("{ $or : [ { name : /^?0/ }, {name : /?1$/   } ] }")
	List<Nutrient> findNutrientByName(String inicio, String ultimo);

	// http://localhost:9090/swagger-ui.html#/
}
