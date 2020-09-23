package com.cacoalpano.apicommon.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 172293245454238031L;

	public BadRequestException(String message) {
        super(message);
    }
}