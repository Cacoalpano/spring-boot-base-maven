package com.cacoalpano.apicommon.exceptions;

public class NotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	public NotFoundException(String message) {
        super(message);
    }
}
