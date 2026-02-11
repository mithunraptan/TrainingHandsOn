package com.training.java8.streamAPI.practicequestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriverClass {

    public static void main(String[] args) {

        // Create collection of Employee objects
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Mithun", 25, 6000));
        employees.add(new Employee("Rahul", 30, 4500));
        employees.add(new Employee("Sneha", 22, 7000));
        employees.add(new Employee("Amit", 28, 5200));

        // Filter employees with salary > 5000
        List<Employee> filteredEmployees =
                employees.stream()
                         .filter(e -> e.getSalary() > 5000)
                         .sorted(Comparator.comparingInt(Employee::getAge))
                         .collect(Collectors.toList());

        // Sort employees by age
//        filteredEmployees.sort(Comparator.comparingInt(Employee::getAge));

        // Calculate and display bonus (10% of salary)
        System.out.println("Employee Details with Bonus:\n");

        filteredEmployees.forEach(e -> {
            double bonus = e.getSalary() * 0.10;
            System.out.println(
                    "Name: " + e.getName() +
                    ", Age: " + e.getAge() +
                    ", Salary: " + e.getSalary() +
                    ", Bonus: " + bonus
            );
        });
    }
}

