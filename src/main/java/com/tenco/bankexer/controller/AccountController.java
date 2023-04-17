package com.tenco.bankexer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	@GetMapping({ "/list", "/" })
	public String list() {
		return "/account/list";
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
