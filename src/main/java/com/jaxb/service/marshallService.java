package com.jaxb.service;

import com.jaxb.model.Employees;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
@Service
public interface marshallService {

    public Employees Records() throws JAXBException;
}
