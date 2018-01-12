package com.project.Survey.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/*") // Wildcard all routes.
public class Router{
	public Router(){

	}

	@PostMapping("submit")
	public String create(
		Model model,
		@RequestParam(value="name") String name, 
		@RequestParam(value="location") String location,
		@RequestParam(value="stack") String stack,
		@RequestParam(value="comment") String comment
		) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("stack", stack);
		model.addAttribute("comment", comment);
		  // ... process information and save it to the session
		  return "answer";
	}


	@RequestMapping("")
	public String index(){
		return "index";
	}

	@RequestMapping("answer")
	public String answer(){
		return "answer";
	}


}
