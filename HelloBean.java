package com.example.microservice.helloworld;

public class HelloBean
{
	private String name="Raja Lohiya";
	private String message=null;
			
	public HelloBean(String str) {
		this.message=str;
	}

	public String getName() {
		return name;
	}
	public String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setMessage(String message) {
		this.message = message;
	}
}
