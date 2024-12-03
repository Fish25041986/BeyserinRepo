package com.beyserin.test.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class InternalServerException extends RuntimeException{
	
	private String methodInError;
	private String message;

	public InternalServerException(String methodInError) {
        this.message = "Error interno en el servidor";
        this.methodInError = methodInError;
    }

}
