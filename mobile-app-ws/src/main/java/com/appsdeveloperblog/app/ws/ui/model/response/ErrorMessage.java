package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Date;


public class ErrorMessage {
	

	private Date timestamp;
	private String message;
	private String httpCode;
	
	public void ErrorMessages() {}

	public ErrorMessage(Date timestamp, String message, String httpCode)
	{
		this.timestamp = timestamp;
		this.message = message;
		this.setHttpCode(httpCode);
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}
	
}
