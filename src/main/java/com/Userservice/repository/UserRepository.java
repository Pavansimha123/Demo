package com.Userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	//User getdepartmentbyid(Long userid);

}
