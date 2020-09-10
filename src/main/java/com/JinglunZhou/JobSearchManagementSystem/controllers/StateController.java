package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.CountryService;
import com.JinglunZhou.JobSearchManagementSystem.service.StateService;

@Controller
public class StateController {
	@Autowired  private StateService stateService;

}
