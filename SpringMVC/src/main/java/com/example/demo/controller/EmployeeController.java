package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;

@Controller
public class EmployeeController {
	List<User> u=new ArrayList();
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		model.addAttribute("listUsers",u);
		return "index";
	}
	
	@GetMapping("/new")
	public String viewPage(Model model) {
		model.addAttribute("user", new User());
		return "form";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user) {
		user.setId(u.size()+1);
		
		u.add(user);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		u.removeIf(i->i.getId() == id);
		return "redirect:/";
	}

}
