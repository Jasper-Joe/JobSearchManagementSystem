package com.JinglunZhou.JobSearchManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JinglunZhou.JobSearchManagementSystem.service.WishlistService;

@Controller
public class WishlistController {
	@Autowired  private WishlistService wishlistService;

}
