package com.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@XmlRootElement(name = "employee_rec")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee
{
    @XmlElement(name = "id", required = true)
    private Integer id;
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "income")
    private double income;


}