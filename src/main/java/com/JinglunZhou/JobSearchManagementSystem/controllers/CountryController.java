package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.JinglunZhou.JobSearchManagementSystem.service.JobTitleService;
import com.JinglunZhou.JobSearchManagementSystem.service.CountryService;


@Controller
public class CountryController {
	@Autowired  private CountryService CountryService;
	
	@GetMapping("/countries")
	public String getCountries() {
		return "country";
	}

}
