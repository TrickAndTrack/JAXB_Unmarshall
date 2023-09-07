package com.jaxb;

import com.jaxb.model.Employee;
import com.jaxb.model.Employees;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class MarshallingAndunmarshallingApplication {


	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(MarshallingAndunmarshallingApplication.class, args);

		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		//We had written this file in marshalling example
		Employees emps = (Employees) jaxbUnmarshaller.unmarshal(new File("employees.xml"));

		for (Employee emp : emps.getEmployees()) {
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
		}

	}

}


// https://youtu.be/w3WibDOie1Y?si=YopbwNJzyD8pQ9g3
// https://github.com/camelya58/spring-jaxb