package com.example.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.model.Student;

public interface StudentRepository extends JpaRepository<Student,String> {
	
	// Buscar cursos de un estudiante en especifico

}
