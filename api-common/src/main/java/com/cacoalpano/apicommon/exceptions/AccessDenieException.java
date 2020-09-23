package com.cacoalpano.apicommon.exceptions;

public class AccessDenieException extends  RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccessDenieException(String message) {
        super(message);
    }
}
