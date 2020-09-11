package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.AppliedService;
import com.JinglunZhou.JobSearchManagementSystem.service.JobService;
import com.JinglunZhou.JobSearchManagementSystem.service.RejectedService;

@Controller
public class RejectedController {
	@Autowired  private RejectedService RejectedService;

}
