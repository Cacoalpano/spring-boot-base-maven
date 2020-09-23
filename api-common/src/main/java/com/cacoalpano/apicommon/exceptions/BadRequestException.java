package com.cacoalpano.apicommon.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 11L;

	public BadRequestException(String message) {
        super(message);
    }
}