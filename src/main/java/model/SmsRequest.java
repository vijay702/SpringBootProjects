package model;

import javax.validation.constraints.NotBlank;



import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {
	

	

	private final Long id;
	
	@NotBlank
	private final String phoneNumber;
	
	@NotBlank
	private final String message;
	
 
  
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public SmsRequest(Long id,@JsonProperty("phoneNumber")  String phoneNumber,@JsonProperty("message") String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SmsRequest [phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}

	
	
}
