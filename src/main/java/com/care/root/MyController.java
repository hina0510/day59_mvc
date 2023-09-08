package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/index")
	public String memberIndex(Model model) {
		model.addAttribute("index", "�⺻ ������ �Դϴ�");
		return "member/index";
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.addObject("login", "�α��� ������ �Դϴ�");
		model.setViewName("member/login");
		return model;
	}
	@RequestMapping("/logout")
	public String logout() {
		return "member/logout";
	}
}
