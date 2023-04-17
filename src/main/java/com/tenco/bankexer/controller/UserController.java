package com.tenco.bankexer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.bankexer.dto.SignInFormDto;
import com.tenco.bankexer.dto.SignUpFormDto;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/sign-up")
	public String signUp() {
		return "/user/signUp";
	}

	@PostMapping("/sign-up")
	public String signUpProc(SignUpFormDto signUpFormDto) {
		return "redirect:/user/sign-in";
	}

	@GetMapping("/sign-in")
	public String signIn() {
		return "/user/signIn";
	}

	@GetMapping("/admin")
	public String adminSignIn() {
		return "/user/admin";
	}

	@PostMapping("/sign-in")
	public String signInProc(HttpServletRequest request, HttpServletResponse response, SignInFormDto signInFormDto) {
		HttpSession session = request.getSession();
		session.setAttribute("username", signInFormDto.getUsername());
		session.setAttribute("pwd", signInFormDto.getPassword());
		System.out.println("username" + signInFormDto.getUsername());
		System.out.println("password" + signInFormDto.getPassword());
		if (signInFormDto.getUsername().equals("admin")) {
			if (signInFormDto.getPassword().equals("1234")){
				return "/user/admin";
			}
		}
		return "redirect:/test/main";
	}

}
