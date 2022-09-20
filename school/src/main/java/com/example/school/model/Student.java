package com.example.school.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Student {
	
	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String phoneNumber;

	@ManyToMany
	@JoinTable(name = "Student_Courses",
			joinColumns = { @JoinColumn(name = "Student_id")},
			inverseJoinColumns = { @JoinColumn (name = "Course_id")}
	)
	private Set<Course> dataSetCourses;


	public Student(){

	}

	public Student(String id, String firstName, String lastName, String phoneNumber, Set<Course> dataSetCourses) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dataSetCourses = dataSetCourses;
	}

	public Set<Course> getDataSetCourses() {
		return dataSetCourses;
	}
	public void setDataSetCourses(Set<Course> dataSetCourses) {
		this.dataSetCourses = dataSetCourses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
