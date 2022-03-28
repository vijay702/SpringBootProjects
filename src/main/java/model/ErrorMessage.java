package model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	
	
	public HttpStatus httpStatus;
	
	public String message;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorMessage [httpStatus=" + httpStatus + ", message=" + message + "]";
	}

	public ErrorMessage(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public ErrorMessage() {
		super();
	}
	
   

}
