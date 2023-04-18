package com.tenco.bankexer.handler.exception;

import org.springframework.http.HttpStatus;

public class CustomRestfullException extends RuntimeException {

	private HttpStatus status;

	public CustomRestfullException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
}
