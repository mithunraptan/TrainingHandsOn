package com.training.spring.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.training.spring.dao.EmployeeDao;

public class SpringHibernateDriver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDao dao = context.getBean(EmployeeDao.class);
		
		//create Employee object
		Employee emp = new Employee("David", 24 );
		Department dept = new Department("IT");
		emp.setDepartment(dept);
		dao.addEmployee(emp);
		
		context.close();
	}

}
