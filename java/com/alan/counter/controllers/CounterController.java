package com.alan.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			return "home.jsp";
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", currentCount);
			
		}
		return "home.jsp";
	}
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
			return "home.jsp";
		}else {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("count", currentCount);
		
		model.addAttribute("www","http://localhost:8080/counter");
		return "display.jsp";
		}
	}
	@RequestMapping("/clear")
	public String clearCount(HttpSession session, Model model) {
		Integer currentCount = null;
		session.setAttribute("count", currentCount);
		return "home.jsp";
	}
	@RequestMapping("/add2")
	public String add2(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			return "home.jsp";
		}else {
		Integer currentCount = (Integer) session.getAttribute("count") + 2;
		session.setAttribute("count", currentCount);
		return "plus2.jsp";
		}
	}
		
	

}
