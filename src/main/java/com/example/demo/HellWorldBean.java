package com.example.demo;

public class HellWorldBean {
	
	private String message;

	public HellWorldBean(String message) {
		this.message = message;
	
	}
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "HellWorldBean [message=" + message + "]";
	}
	
	

}
