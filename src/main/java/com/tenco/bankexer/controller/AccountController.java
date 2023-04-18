package com.tenco.bankexer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.bankexer.handler.exception.CustomPageException;

@Controller
@RequestMapping("/account")
public class AccountController {
	@GetMapping({ "/list", "/" })
	public void list() {
		
		throw new CustomPageException("페이지를 찾을 수 없습니다.", HttpStatus.NOT_FOUND);
//		return "/account/list";
	}

	@GetMapping("/withdraw")
	public String withdraw() {

		return "/account/withdrawForm";
	}

	@GetMapping("/deposit")
	public String deposit() {
		return "/account/depositForm";
	}

	@GetMapping("/transfer")
	public String transfer() {

		return "/account/transferForm";
	}

	@GetMapping("/save")
	public String save() {

		return "/account/saveForm";
	}

	@GetMapping("/detail")
	public String detail() {
		return "/account/detailForm";
	}
}
