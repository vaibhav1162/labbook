package com.mycompany.app;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;






public class Employee {
	  


    


@Value("${employeeId}")
private int employeeId;
@Value("${employeeName}")
private String employeeName;
@Value("${salary}")
private double salary;
@Value("${businessUnit}")
private String businessUnit;
@Value("${age}")
private int age;

public Employee() {
}

public void displayAllValues() {
	System.out.println("EMPLOYEE DETAILS");
	System.out.println("----------------------------------------------");
	System.out.println("Employee ID : "+employeeId);
	System.out.println("Employee Name : "+employeeName);
	System.out.println("Employee Salary : "+salary);
	System.out.println("Employee Buisness Unit : "+businessUnit);
	System.out.println("Employee Age : "+age);
	
}
}






