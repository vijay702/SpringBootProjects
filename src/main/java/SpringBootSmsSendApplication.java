


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"configuration","controller","model","service","exception"})
@EnableScheduling
public class SpringBootSmsSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSmsSendApplication.class, args);
	}

	
	
}
