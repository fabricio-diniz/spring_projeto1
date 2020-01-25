package com.spring.segundoProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.segundoProjeto.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.name like %?1%")
	User findByNameQualquerCoisa(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
}
