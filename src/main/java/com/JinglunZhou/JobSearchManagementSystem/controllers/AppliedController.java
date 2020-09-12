package com.JinglunZhou.JobSearchManagementSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.JinglunZhou.JobSearchManagementSystem.models.Applied;
import com.JinglunZhou.JobSearchManagementSystem.service.AppliedService;



@Controller
public class AppliedController {
	@Autowired  
	private AppliedService appliedService;
	
	@GetMapping("/applied")
	public String getAppliedJobs(Model model) {
		List<Applied> appliedJobList = appliedService.getAppliedJobs();
		model.addAttribute("appliedJobs",appliedJobList);
		return "applied";
	}
	
	@PostMapping("/applied/addNew")
	public String addNew(Applied applied) {
		appliedService.save(applied);
		return "redirect:/applied";
	}

}
