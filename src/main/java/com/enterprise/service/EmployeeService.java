
package com.enterprise.service;

import java.util.List;
import com.enterprise.model.Employee;

public interface EmployeeService {

 List<Employee> getEmployees();

 void addEmployee(Employee employee);

}
