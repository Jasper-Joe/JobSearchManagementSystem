package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.JobService;
import com.JinglunZhou.JobSearchManagementSystem.service.JobTitleService;

@Controller
public class JobController {
	@Autowired  private JobService jobService;

}
