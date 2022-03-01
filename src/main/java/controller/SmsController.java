package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.SmsRequest;
import service.SmsService;






@RestController

public class SmsController {
	
	@Autowired
	private final SmsService smsService;

	
	public SmsController(SmsService smsService) {
		super();
		this.smsService = smsService;
	}

	
	@PostMapping("/api/sms")
	public void sendSms (@Valid @RequestBody SmsRequest smsRequest) {
		
		smsService.sendSms(smsRequest);
	}
	
	

}
