package com.practice.firstwebjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.firstwebjpa.doc.EmployeeRepo;
import com.practice.firstwebjpa.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		
		return "home.jsp";
	}

}
	