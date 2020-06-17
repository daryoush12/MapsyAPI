package com.mapsy.rest.excpetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PlaceResourceNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6570410409592716215L;
	
	
	public PlaceResourceNotFound() {
		super();
	}

	public PlaceResourceNotFound(String message, Throwable cause) {
		super();
	}
	
	public PlaceResourceNotFound(String message) {
		super();
	}
	
	public PlaceResourceNotFound(Throwable cause) {
		super();
	}
	
}
