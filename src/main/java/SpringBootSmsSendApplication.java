


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"configuration","controller","model","service"})
public class SpringBootSmsSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSmsSendApplication.class, args);
	}

}
