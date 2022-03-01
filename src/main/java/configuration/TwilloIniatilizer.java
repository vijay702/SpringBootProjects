package configuration;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

@Configuration
public class TwilloIniatilizer {
	
      private final static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TwilloIniatilizer.class);

	private final TwilioConfiguration twilioConfiguration;
	
	@Autowired
	public TwilloIniatilizer(TwilioConfiguration twilioConfiguration) {
		super();
		this.twilioConfiguration = twilioConfiguration;
		
		Twilio.init(twilioConfiguration.getAccountSid(),
				    twilioConfiguration.getAuthToken()
				    
				
				);
		
		LOGGER.info("TWillo iniatlize ........ with account sid {}", twilioConfiguration.getAccountSid() );
	}

	
	
	
	

}
