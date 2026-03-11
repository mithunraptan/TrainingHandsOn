package com.enterprise.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.enterprise.model.Employee;
import com.enterprise.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class ViewEmployeesAction extends ActionSupport{
	
	@Autowired
	private EmployeeService employeeService;
	
	private List<Employee> employeeList;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		employeeList=employeeService.getEmployees();
		return "success";
	}
	
	  public List<Employee> getEmployeeList(){
	        return employeeList;
	    }

}
