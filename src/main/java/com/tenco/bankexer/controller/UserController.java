package com.tenco.bankexer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.bankexer.dto.SignInFormDto;
import com.tenco.bankexer.dto.SignUpFormDto;
import com.tenco.bankexer.handler.exception.CustomRestfullException;
import com.tenco.bankexer.repository.model.User;
import com.tenco.bankexer.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	
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

	@PostMapping("/sign-in")
	public String signInProc(SignInFormDto signInFormDto) {
		if(signInFormDto.getUsername()==null || signInFormDto.getUsername().isEmpty()) {
			throw new CustomRestfullException("username을 입력하세요.", HttpStatus.BAD_REQUEST);
		}
		if(signInFormDto.getPassword()==null || signInFormDto.getPassword().isEmpty()) {
			throw new CustomRestfullException("password를 입력하세요.", HttpStatus.BAD_REQUEST);
		}
		
		return "redirect:/test/main";
	}

	@GetMapping("/admin")
	public String adminSignIn() {
		return "/user/admin";
	}

}
