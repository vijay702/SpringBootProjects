package model;

import javax.validation.constraints.NotBlank;



import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {
	

	

	private  Long id;
	
	public void setId(Long id) {
		this.id = id;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@NotBlank
	private  String phoneNumber;
	
	@NotBlank
	private  String message;
	
 




	public SmsRequest(Long id,@JsonProperty("phoneNumber")  String phoneNumber,@JsonProperty("message") String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.id = id;
	}

	
	public Long getId() {
		return id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getMessage() {
		return message;
	}


	@Override
	public String toString() {
		return "SmsRequest [phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}

	
	
}
