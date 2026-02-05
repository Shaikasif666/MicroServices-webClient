package com.microservices.Firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Firstproject.model.Student;
import com.microservices.Firstproject.response.StudentResponse;
import com.microservices.Firstproject.service.StudentService;

@RestController
@RequestMapping("api/v1")
public class StudentController {

	@Autowired
	StudentService studentservice;
	
	@GetMapping("getallstudents")
	public List<Student> getAllStudents(){
		return studentservice.getAllStudents();
	}
	@GetMapping("getStudent/{id}")
	StudentResponse getStudent(@PathVariable int id) {
		return studentservice.getStudent(id);
	}
}
