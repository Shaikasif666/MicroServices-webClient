package com.microservices.Firstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student61")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	String fname;
	String lname;
	int age;
	String email;
	
}
