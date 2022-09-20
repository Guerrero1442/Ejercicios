package com.example.school.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cursos")
public class Course {
	
	@Id
	private Integer id;

	private String name;

	private String schedule;

	@ManyToMany(mappedBy = "dataSetCourses")
	@JsonIgnore
	private Set<Student> dataSetStudents;

	public Course(Integer id, String name, String schedule, Set<Student> dataSetStudents) {
		this.id = id;
		this.name = name;
		this.schedule = schedule;
		this.dataSetStudents = dataSetStudents;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Set<Student> getDataSetStudents() {
		return dataSetStudents;
	}

	public void setDataSetStudents(Set<Student> dataSetStudents) {
		this.dataSetStudents = dataSetStudents;
	}

	public Course(){}
}