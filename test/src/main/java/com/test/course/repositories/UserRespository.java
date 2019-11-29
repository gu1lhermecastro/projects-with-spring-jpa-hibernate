package com.test.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{
	
}
