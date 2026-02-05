package com.microservices.addressservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.addressservice.model.Address;

@Repository
public interface Addressrepo extends JpaRepository<Address, Integer> {
		@Query(nativeQuery = true, value= "SELECT sa.id, sa.city, sa.state, sa.student_id  FROM address61 sa"
				+ " join student61 s on s.sid = sa.student_id where sa.student_id=:sid")
		
		Optional<Address> findAddressByStudentId(@Param("sid")int sid);
}
