package com.microservices.addressservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="address61")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String city;
	String state;
	Integer student_id;
}
