package com.JinglunZhou.JobSearchManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JinglunZhou.JobSearchManagementSystem.models.Rejected;

@Repository
public interface RejectedRepository extends JpaRepository<Rejected, Integer> {

}
