package com.JinglunZhou.JobSearchManagementSystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("applied/findById")
	@ResponseBody
	public Optional<Applied> findById(int id) {
		return appliedService.findById(id);
		
	}
	
	@RequestMapping(value="/applied/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Applied applied) {
		appliedService.save(applied);
		return "redirect:/applied";
	}
	
	@RequestMapping(value="/applied/delete",method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(int id) {
		appliedService.delete(id);
		return "redirect:/applied";
	}

}
