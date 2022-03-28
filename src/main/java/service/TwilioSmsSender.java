package service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;


import configuration.TwilioConfiguration;
import model.SmsRequest;




@Service("twilio")
public class TwilioSmsSender implements SmsSender {
	
	
	
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TwilioSmsSender.class);
	
	private final TwilioConfiguration twilioConfiguration;
	
   @Autowired
  
	public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
		super();
		this.twilioConfiguration = twilioConfiguration;
	}

 
   @Override	 
	public void sendSms(SmsRequest smsRequest)   {
	   
	
	   
		if(isPhoneNumberValid(smsRequest.getPhoneNumber())) {
		 PhoneNumber to = new  PhoneNumber(smsRequest.getPhoneNumber());
			PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
			LOGGER.info("Trial Number " +twilioConfiguration.getTrialNumber());
		String message = smsRequest.getMessage();
		LOGGER.info("send sms {}" +smsRequest);
		MessageCreator creator = Message.creator(to,from,message);
		creator.create();
		}else {
			LOGGER.debug("not working");
			throw  new IllegalArgumentException("phone number [" +smsRequest.getPhoneNumber() +"]is a not valid ");
			
		}
		
	}

 /*  @Scheduled(fixedRate = 5000L)
   public void printSomething() {
	   
	   LOGGER.info("HElloooooo");
   } */

	private boolean isPhoneNumberValid(String phoneNumber) {
		// TODO implement phone number 
		return true;
	}


	
	
}