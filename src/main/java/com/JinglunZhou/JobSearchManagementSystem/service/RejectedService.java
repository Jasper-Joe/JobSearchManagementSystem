package com.JinglunZhou.JobSearchManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JinglunZhou.JobSearchManagementSystem.models.Rejected;
import com.JinglunZhou.JobSearchManagementSystem.repositories.RejectedRepository;

@Service
public class RejectedService {
	
	@Autowired
	private RejectedRepository rejectedRepository;
	
	// return list of rejected jobs
	public List<Rejected> getRejectedJobs() {
		return rejectedRepository.findAll();
	}
	
	//save new rejected job
	public void save(Rejected rejected) {
		rejectedRepository.save(rejected);
	}
	
	//get by id
	public Optional<Rejected> findById(int id) {
		return rejectedRepository.findById(id);
	}
	
	public void delete(int id) {
		rejectedRepository.deleteById(id);
		
	}

}
