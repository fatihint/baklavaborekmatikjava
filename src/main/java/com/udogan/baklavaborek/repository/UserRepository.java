package com.udogan.baklavaborek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udogan.baklavaborek.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}