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


import com.JinglunZhou.JobSearchManagementSystem.models.Rejected;
import com.JinglunZhou.JobSearchManagementSystem.service.RejectedService;

@Controller
public class RejectedController {
	@Autowired  
	private RejectedService rejectedService;
	
	@GetMapping("/rejected")
	public String getRejectedJobs(Model model) {
		List<Rejected> rejectedJobList = rejectedService.getRejectedJobs();
		model.addAttribute("rejectedJobs",rejectedJobList);
		return "rejected";
	}
	
	@PostMapping("/rejected/addNew")
	public String addNew(Rejected rejected) {
		rejectedService.save(rejected);
		return "redirect:/rejected";
	}
	
	@RequestMapping("rejected/findById")
	@ResponseBody
	public Optional<Rejected> findById(int id) {
		return rejectedService.findById(id);
		
	}
	
	@RequestMapping(value="/rejected/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Rejected rejected) {
		rejectedService.save(rejected);
		return "redirect:/rejected";
	}
	
	@RequestMapping(value="/rejected/delete",method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(int id) {
		rejectedService.delete(id);
		return "redirect:/rejected";
	}

}
