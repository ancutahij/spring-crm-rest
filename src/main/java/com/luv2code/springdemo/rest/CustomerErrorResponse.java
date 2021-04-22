package com.luv2code.springdemo.rest;

public class CustomerErrorResponse  {

	private int id; 
	private String message;
	private long timestamp;
	
	public CustomerErrorResponse(int id, String message, long timestamp) {
		super();
		this.id = id;
		this.message = message;
		this.timestamp = timestamp;
	}

	public CustomerErrorResponse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
