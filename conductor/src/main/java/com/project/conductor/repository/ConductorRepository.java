package com.project.conductor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.conductor.model.Conductor;


public interface ConductorRepository extends JpaRepository<Conductor, Integer> {
	
}