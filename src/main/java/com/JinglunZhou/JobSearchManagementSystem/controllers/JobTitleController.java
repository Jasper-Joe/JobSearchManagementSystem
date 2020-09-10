package com.JinglunZhou.JobSearchManagementSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.JinglunZhou.JobSearchManagementSystem.models.JobTitle;
import com.JinglunZhou.JobSearchManagementSystem.service.JobTitleService;

@Controller
public class JobTitleController {
	@Autowired  private JobTitleService jobTitleService;
	@GetMapping("/jobTitles")
	public String getJobTitles(Model model) {		
		
		//List<JobTitle> jobTitleList = jobTitleService.getJobTitles();	

		//model.addAttribute("jobTitles", jobTitleList);
		return "jobTitle";
	}	

}
