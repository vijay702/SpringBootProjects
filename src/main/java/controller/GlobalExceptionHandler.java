package controller;

import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import model.ErrorMessage;



@RestControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(UnknownHostException.class)
	public ResponseEntity<ErrorMessage> studentNotFoundException(UnknownHostException unknownHostException, WebRequest webRequest) {
		
		
		ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,unknownHostException.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
		
		
	}

}
