package com.JinglunZhou.JobSearchManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JinglunZhou.JobSearchManagementSystem.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
