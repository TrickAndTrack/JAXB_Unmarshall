package com.jaxb.service.impl;

import com.jaxb.model.Employee;
import com.jaxb.model.Employees;
import com.jaxb.service.marshallService;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
@Service
public class marshallServiceImpl implements marshallService {

    public Employees Records() throws JAXBException {
        File file = new File("C:\\Users\\Developer\\OneDrive\\Desktop\\files\\employees.xml");

        JAXBContext  jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var emps = (Employees) jaxbUnmarshaller.unmarshal(file);
            for (Employee emp : emps.getEmployees()) {
                System.out.println(emp.getId());
                System.out.println(emp.getFirstName());
                System.out.println(emp.getLastName());
                System.out.println(emp.getIncome());
            }

        return emps;
    }}
