package com.bank.customer;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CardException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CardException() {
		super();
	}

	public CardException(String s) {
		super(s);
	}

}
