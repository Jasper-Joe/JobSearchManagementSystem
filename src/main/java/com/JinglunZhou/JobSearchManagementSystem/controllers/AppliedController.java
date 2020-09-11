package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.AppliedService;

@Controller
public class AppliedController {
	@Autowired  private AppliedService AppliedService;

}
