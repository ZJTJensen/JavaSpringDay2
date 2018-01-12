package com.project.Counter.controllers;

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

	// public int memes(HttpSession session){
	// 	int views = 0;
	// 	session.setAttribute("views", views);
	// 	return views; 
	// }

	@RequestMapping("/index")
	public String index(HttpSession session){

		if(session.isNew()){
			session.setAttribute("views", 0);
		}
		Integer count = (Integer) session.getAttribute("views");
		System.out.println(count);
		count += 1;
		session.setAttribute("views", count);
		return "index";
	}

	@RequestMapping("views")
	public String views(HttpSession session, Model model){
		if(session.isNew()){
			session.setAttribute("views", 0);
		}
		model.addAttribute("views", session.getAttribute("views"));
		return "views";
	}

	@RequestMapping("")
	public String redirect(HttpServletRequest req){		
		String url = req.getRequestURI().toString();
		return "redirect:/index";
	}		
}
