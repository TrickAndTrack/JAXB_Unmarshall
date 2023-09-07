package com.jaxb.service.impl;

import com.jaxb.model.Employee;
import com.jaxb.model.Employees;
import com.jaxb.service.marshallService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class marshallServiceImpl implements marshallService {

    public void jsonObject() throws JAXBException   {


          var  jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employees emps = (Employees) jaxbUnmarshaller.unmarshal(new File("employees.xml"));
            for (Employee emp : emps.getEmployees()) {
                System.out.println(emp.getId());
                System.out.println(emp.getFirstName());
            }

    }}
