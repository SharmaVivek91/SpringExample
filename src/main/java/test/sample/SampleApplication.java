package test.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation is comprised of @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan
//this is bootstrap class
@SpringBootApplication
public class SampleApplication {
	public static void main(String[] args) {
		//creates application context
		SpringApplication.run(SampleApplication.class, args);
	}

}
