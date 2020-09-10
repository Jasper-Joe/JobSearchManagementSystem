package com.JinglunZhou.JobSearchManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JinglunZhou.JobSearchManagementSystem.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
