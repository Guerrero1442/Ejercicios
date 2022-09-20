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

import com.example.school.repository.CourseRepository;

import com.example.school.model.Course;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
	
		
	@Autowired
	private CourseRepository courseRepository;

	//? Ver todos los autores
	@GetMapping("/course")
	public List<Course> getAuthors() {
		return courseRepository.findAll();
	}

	//? Ver autor por ID
	@GetMapping("/course/{courseId}")
	public Course getAuthor(@PathVariable Integer courseId){
		Course c = courseRepository.findById(courseId).get();
		return c;
	}

	//? Publicar autor
	@PostMapping("/course")
	public Course saveAuthor(@RequestBody Course course){
		courseRepository.save(course);
		return course;
	}

	//? Publicar varios autores
	@PostMapping("/courses")
	public List<Course> saveAuthors(@RequestBody List<Course> coursesList){
		courseRepository.saveAll(coursesList);
		return coursesList;
	}

	//? Actualizar autores
	@PutMapping("/student/{courseId}")
	public Course putAuthor(@PathVariable Integer courseId, @RequestBody Course course){
		Course c = courseRepository.findById(courseId).get();

		c.setName(course.getName());
		c.setSchedule(course.getSchedule());

		courseRepository.save(c);
		return c;
	}

	//? Borrar autor
	@DeleteMapping("/course/{courseId}")
	public Course deleteAuthor(@PathVariable Integer courseId){
		Course c = courseRepository.findById(courseId).get();
		courseRepository.deleteById(courseId);

		return c;
	}

}
