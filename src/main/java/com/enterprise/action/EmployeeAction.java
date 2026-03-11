
package com.enterprise.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.enterprise.service.EmployeeService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enterprise.model.Employee;

@Component
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

	Employee emp = new Employee();


	@Autowired
	private EmployeeService employeeService;
// private List<Employee> employees;

	 public String execute() {
	  // TODO  must integrate Spring bean and call service
		 employeeService.addEmployee(emp);
		 
		 return SUCCESS;
	 }

	 @Override
	 public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	 }
	
	 public Employee getEmp() {
		return emp;
	 }
	
	 public void setEmp(Employee emp) {
		this.emp = emp;
	 }
	 
	 

	 @Override
	public void validate() {
		// TODO Auto-generated method stub
		 System.out.println("hello validate");
		if(emp.getName()==null || emp.getName().isEmpty()) {
			
			addFieldError("name", "name required");
		}
	}
 
 
 
 
}
