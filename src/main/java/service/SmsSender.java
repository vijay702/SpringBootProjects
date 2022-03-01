package service;

import model.SmsRequest;

public interface SmsSender {
	
	void sendSms(SmsRequest smsRequetst);

}
