package com.learning.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.entity.Student;
import com.learning.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentLoginAction extends ActionSupport {
	private String name;
	private String email;
	
	@Autowired
	private StudentService studentService;
	
	
	@Override
	public String execute() throws Exception {

		   Student studentFromDb = studentService.studentLogin(name, email);

		    if(studentFromDb != null){

		        // get session
		        Map<String,Object> session = ActionContext.getContext().getSession();

		        // store studentId
		        session.put("studentId", studentFromDb.getStudentId());
		        
		        return SUCCESS;
		    }

		    addActionError("Invalid login credentials");
		    return INPUT;
	}
	
	@Override
	public void validate() {

		  if(name == null || name.trim().isEmpty()){
		        addFieldError("name", "Name is required for login");
		    }

		    if(email == null || email.trim().isEmpty()){
		        addFieldError("email", "Email is required for login");
		    }

		    else if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
		        addFieldError("email", "Invalid email format");
		    }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
