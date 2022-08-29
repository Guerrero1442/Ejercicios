package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.model.Cd;

public interface CdRepository extends JpaRepository<Cd, Integer>{
	
}
