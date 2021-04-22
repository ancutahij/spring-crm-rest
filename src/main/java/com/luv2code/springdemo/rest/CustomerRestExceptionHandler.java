package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class CustomerRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlException(CustomerNotFoundException exec){
		
		CustomerErrorResponse response = new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exec.getMessage(),
				System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlException(Exception exec){
		
		CustomerErrorResponse response = new CustomerErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				exec.getMessage(),
				System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

}
