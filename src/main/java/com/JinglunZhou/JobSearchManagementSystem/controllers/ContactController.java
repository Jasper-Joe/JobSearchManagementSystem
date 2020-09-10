package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.ContactService;
import com.JinglunZhou.JobSearchManagementSystem.service.JobTitleService;

@Controller
public class ContactController {
	@Autowired  private ContactService contactService;

}
