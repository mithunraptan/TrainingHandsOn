
package com.enterprise.dao;

import java.util.List;
import com.enterprise.model.Employee;

public interface EmployeeDAO {

 List<Employee> findAll();

 void save(Employee employee);

}
