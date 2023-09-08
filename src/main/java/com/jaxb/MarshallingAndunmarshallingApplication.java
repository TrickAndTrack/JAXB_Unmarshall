package com.jaxb;

import com.jaxb.model.Employee;
import com.jaxb.model.Employees;
import com.jaxb.service.marshallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
@EnableAutoConfiguration
public class MarshallingAndunmarshallingApplication {



	@Autowired
	private marshallService marshallService;

	public static void main(String[] args)  {
		SpringApplication.run(MarshallingAndunmarshallingApplication.class, args);







	}

}


// https://youtu.be/w3WibDOie1Y?si=YopbwNJzyD8pQ9g3
// https://github.com/camelya58/spring-jaxb