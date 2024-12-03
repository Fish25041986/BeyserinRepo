package com.beyserin.test.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	
	private String methodInError;
	private String message;

	public ResourceNotFoundException(String methodInError) {
        this.message = "No se haya información con el identificador proporcionado";
       
	}
}
