package com.example.school.controller;

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

import com.example.school.model.Student;
import com.example.school.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	//? Ver todos los autores
	@GetMapping("/student")
	public List<Student> getAuthors() {
		return studentRepository.findAll();
	}

	//? Ver autor por ID
	@GetMapping("/student/{studentId}")
	public Student getAuthor(@PathVariable String studentId){
		Student a = studentRepository.findById(studentId).get();
		return a;
	}

	//? Publicar autor
	@PostMapping("/student")
	public Student saveAuthor(@RequestBody Student student){
		studentRepository.save(student);
		return student;
	}

	//? Publicar varios autores
	@PostMapping("/students")
	public List<Student> saveStudents(@RequestBody List<Student> studentList){
		studentRepository.saveAll(studentList);
		return studentList;
	}

	//? Actualizar autores
	@PutMapping("/student/{studentId}")
	public Student putAuthor(@PathVariable String studentId, @RequestBody Student student){
		Student s = studentRepository.findById(studentId).get();

		s.setFirstName(student.getFirstName());
		s.setLastName(student.getLastName());
		s.setPhoneNumber(student.getPhoneNumber());
		s.setDataSetCourses(student.getDataSetCourses());

		studentRepository.save(s);
		return s;
	}

	//? Borrar autor
	@DeleteMapping("/student/{studentId}")
	public Student deleteAuthor(@PathVariable String studentId){
		Student a = studentRepository.findById(studentId).get();
		studentRepository.deleteById(studentId);

		return a;
	}
}
