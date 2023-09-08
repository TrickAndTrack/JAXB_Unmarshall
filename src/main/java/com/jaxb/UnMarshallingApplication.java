package com.jaxb;


import com.jaxb.service.unmarshallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class UnMarshallingApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(UnMarshallingApplication.class);
	@Autowired
	private unmarshallService unmarshallService;


	public static void main(String[] args)  {

		logger.info("\n Spring Application Started ");
		SpringApplication.run(UnMarshallingApplication.class, args);
		logger.info("\n Spring Application Stopped ");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\n Executing Command Line Runner");
		unmarshallService.Records();

	}
}


// https://youtu.be/w3WibDOie1Y?si=YopbwNJzyD8pQ9g3
// https://github.com/camelya58/spring-jaxb
// https://youtu.be/j9KypS10ry0?si=gHfrpb2uqYz90ksk