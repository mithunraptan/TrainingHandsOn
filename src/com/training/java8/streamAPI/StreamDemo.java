package com.training.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//Strean API
		//Intermediate operation - n numbers
		//Terminal operation - single terminal operation
		
		List<Employee> listOfEmployees = Arrays.asList(new Employee("Mithun",10000,24,"IT"), 
				                                       new Employee("sagar",15000,24,"CSE"), 
				                                       new Employee("ayan",20000,26,"IT"), 
				                                       new Employee("saurabh",30000,27,"ECE"), 
				                                       new Employee("rima",25000,24,"CSE"));
		
		//find second highest salary
		
//		List<Employee> list = listOfEmployees.stream().sorted((o1,o2)->Double.compare(o2.getSalary(), o1.getSalary())).collect(Collectors.toList());
//		Optional<Employee> first = list.stream().skip(1).findFirst();
//		System.out.println(first.get().getSalary());
		
//		Employee employee = listOfEmployees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
//		System.out.println(employee.getSalary());
		
		
		//find the oldest employee
//		Optional<Employee> oldestEmployee = listOfEmployees.stream().max(Comparator.comparing(Employee::getAge));
//		System.out.println(oldestEmployee.get().getName());
		
		//count empployees in each department
//		Map<String, Long> collect = listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//		System.out.println(collect);
		
		//average salary in each department
//		Map<String, Double> avgSalOnEachDept = listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(avgSalOnEachDept);
		
		//get employees whose salary is above average
//		OptionalDouble average = listOfEmployees.stream().mapToDouble(Employee::getSalary).average();
//		List<Employee> getEmployeesMoreSalThanAvg = listOfEmployees.stream().filter((obj)->obj.getSalary()>average.getAsDouble()).collect(Collectors.toList());
//		getEmployeesMoreSalThanAvg.forEach((o)->System.out.println(o.getName()));
		
		//sort by dept then by sal descending
		Stream<Employee> sortedEmployee = listOfEmployees.stream().sorted(Comparator.comparing(Employee::getDept).thenComparing(Comparator.comparing(Employee::getSalary)).reversed());
		sortedEmployee.forEach(System.out::println);
	
	}

}
