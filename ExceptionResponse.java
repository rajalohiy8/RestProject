package com.example.microservice.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timeStamp;
	private String massage;
	private String details;
	public ExceptionResponse(Date timeStamp, String massage, String details) {
		super();
		this.timeStamp = timeStamp;
		this.massage = massage;
		this.details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
