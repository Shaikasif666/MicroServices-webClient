package com.microservices.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.addressservice.model.Address;
import com.microservices.addressservice.repo.Addressrepo;
@Service
public class AddressService{
	@Autowired
	Addressrepo addressrepo;
	public Address getAddressById(int id){
		return addressrepo.findAddressByStudentId(id).orElseThrow();
	}

}
