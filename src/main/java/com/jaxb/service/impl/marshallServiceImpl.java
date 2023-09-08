package com.jaxb.service.impl;

import com.jaxb.model.Employee;
import com.jaxb.model.Employees;
import com.jaxb.service.marshallService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
@Service
public class marshallServiceImpl implements marshallService {

    public Employees jsonObject() throws JAXBException   {

        File file = new File("employees.xml");

        JAXBContext  jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employees emps = (Employees) jaxbUnmarshaller.unmarshal(file);
            for (Employee emp : emps.getEmployees()) {
                System.out.println(emp.getId());
                System.out.println(emp.getFirstName());
            }

        return emps;
    }}
