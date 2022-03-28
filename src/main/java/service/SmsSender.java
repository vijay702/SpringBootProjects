package service;

import org.springframework.scheduling.annotation.Scheduled;


import model.SmsRequest;

public interface SmsSender {
    
	@Scheduled(fixedRate = 5000L)
	void sendSms(SmsRequest smsRequetst) ;

}
