package com.microservices.Firstproject.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.Firstproject.model.Student;
import com.microservices.Firstproject.repo.StudentRepo;
import com.microservices.Firstproject.response.Address;
import com.microservices.Firstproject.response.StudentResponse;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentrepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	//getAllstudents
 public	List<Student> getAllStudents(){
		return studentrepo.findAll();
	}
	
 public StudentResponse getStudent(int id) {
		Student student= studentrepo.findById(id).orElseThrow();
		
		StudentResponse studentResponse = modelMapper.map(student, StudentResponse.class);
		Address address= restTemplate.getForObject("http://localhost:8002/api/v1/getAdd/{id}", Address.class, id);
		
		studentResponse.setAddress(address);
		return studentResponse;
	}
	
}
