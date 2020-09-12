package com.JinglunZhou.JobSearchManagementSystem.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JinglunZhou.JobSearchManagementSystem.models.Applied;
import com.JinglunZhou.JobSearchManagementSystem.repositories.AppliedRepository;

@Service
public class AppliedService {
	
	@Autowired
	private AppliedRepository appliedRepository;
	
	// return list of applied jobs
	public List<Applied> getAppliedJobs() {
		return appliedRepository.findAll();
	}
	
	//save new appled job
	public void save(Applied applied) {
		appliedRepository.save(applied);
	}
	
	//get by id
	public Optional<Applied> findById(int id) {
		return appliedRepository.findById(id);
	}

}
