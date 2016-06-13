package com.litian.web.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.litian.web.blog.service.i.IMemberService;

@Controller
public class MemberController {

	@Autowired
	private IMemberService service;

	@RequestMapping("/login")
	public String login() {
		System.out.println(service.sayHello());
		return "member/login";
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView("member/register");
		return mav;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("member/index");
		return mav;
	}

	@RequestMapping("/registerSuccess")
	public ModelAndView registerSuccess() {
		ModelAndView mav = new ModelAndView("member/register_success");
		return mav;
	}
}
