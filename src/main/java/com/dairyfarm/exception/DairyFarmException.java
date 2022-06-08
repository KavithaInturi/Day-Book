package com.dairyfarm.exception;

import org.springframework.http.HttpStatus;

public class DairyFarmException extends RuntimeException {
	private static final long serialVersionUID = -5457878880686258568L;
	private HttpStatus status;
	private String message;

	public DairyFarmException(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

	public DairyFarmException(String message, HttpStatus status, String message1) {
		super(message);
		this.status = status;
		this.message = message1;
	}

	public HttpStatus getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
