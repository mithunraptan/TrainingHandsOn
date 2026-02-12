package com.training.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		//Strean API
		//Intermediate operation - n numbers
		//Terminal operation - single terminal operation
		
		List<Employee> listOfEmployees = Arrays.asList(new Employee("Mithun"), new Employee("sagar"));
		List<Employee> filteredEmployeeList = listOfEmployees.stream().filter(obj->obj.getName().startsWith("s")).collect(Collectors.toList());
		
		filteredEmployeeList.forEach(System.out::println);
		
	}

}
