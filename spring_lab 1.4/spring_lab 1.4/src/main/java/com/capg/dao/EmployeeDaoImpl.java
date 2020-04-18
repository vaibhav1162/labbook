package com.capg.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capg.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao{

	private Map<Integer,Employee>store=new HashMap<>();
	
	 public EmployeeDaoImpl(){
		    store.put(99, new Employee(100,"Vaibhav",54542.99));
	        store.put(100,new Employee(100,"Rama",12345.67));
	        store.put(101,new Employee(101,"Abhimanyu",231995.66));
	    }
	 
	 @Override
	 public Employee fetchById(int id) {
		 Employee employee = null;
		 if(store.containsKey(id)) {
			  employee=store.get(id);
		 }
		 else{
			System.out.println("Incorrect Id");
		 }
		 return employee;
	 }
	 


}
