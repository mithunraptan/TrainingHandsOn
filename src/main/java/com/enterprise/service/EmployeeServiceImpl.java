
package com.enterprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.dao.EmployeeDAO;
import com.enterprise.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

@Autowired
 private EmployeeDAO employeeDAO;

 public void setEmployeeDAO(EmployeeDAO dao) {
  this.employeeDAO = dao;
 }

 @Override
 public List<Employee> getEmployees() {
  return employeeDAO.findAll();
 }

 @Override
 public void addEmployee(Employee employee) {
  // TODO must add validation before saving
  employeeDAO.save(employee);
 }

}
