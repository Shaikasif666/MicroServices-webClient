package com.microservices.Firstproject.response;

import lombok.Data;


@Data
public class StudentResponse {
	
	int sid;
	String fname;
	String lname;
	int age;
	String email;
	
	Address Address;

}
