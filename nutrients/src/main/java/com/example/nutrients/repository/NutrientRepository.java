package com.example.nutrients.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nutrients.model.Nutrient;

public interface NutrientRepository extends MongoRepository<Nutrient, String>{
	
}
