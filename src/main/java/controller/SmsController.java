package controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.SmsRequest;
import service.SmsService;






@RestController

public class SmsController {
	
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SmsController.class);
	
	
	private static final String HOST = "localhost";
	
	private final SmsService smsService;

	@Autowired
	public SmsController(SmsService smsService) {
		super();
		this.smsService = smsService;
	}

	
	@PostMapping("/api/sms")

	public void sendSms (@Valid @RequestBody SmsRequest smsRequest) throws UnknownHostException  {
		
		Boolean isConnected =!HOST.equals(InetAddress.getLocalHost().getHostAddress().toString());
		
		try {
			
			if(isConnected) {
				
				LOGGER.debug("sending sms");
				
				smsService.sendSms(smsRequest);
				
			}
		}catch (Exception ex) {
			
			throw new UnknownHostException("please connect with internet" +ex);
			
		}
		
		/*if(isConnected){
			LOGGER.debug("sending sms");
			
			smsService.sendSms(smsRequest);
		}*/
		
	
	}
	
	

}
