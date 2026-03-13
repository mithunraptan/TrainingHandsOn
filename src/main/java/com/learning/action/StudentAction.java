package com.learning.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.entity.Course;
import com.learning.entity.Student;
import com.learning.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * validateStudentLogin() will call before execute the studentLogin() method
 */

@Controller
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
	
	private String name;
	private String email;
	
	
	private Student student = new Student();
	
	private List<Course> courses;
	
	@Autowired
	private StudentService studentService;
	

	
	@Override
	public String execute() throws Exception {
		studentService.registerStudent(student);
		
		return SUCCESS;
	}
	
	
	
	@Override
	public void validate() {

	    if(student.getName() == null || student.getName().trim().isEmpty()){
	        addFieldError("name", "Student name is required");
	    }

	    if(student.getEmail() == null || student.getEmail().trim().isEmpty()){
	        addFieldError("email", "Email is required");
	    }

	    else if(!student.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")){
	        addFieldError("email", "Invalid email format");
	    }
	}
	
	
	
	
	
	public String getCoursesByStudent() {
		List<Course> coursesByStudent = studentService.getCoursesByStudent(1);
		courses = coursesByStudent;
		return SUCCESS;
	}
	
	
	
	
	
//	
//	public String studentLogin() {
//		System.out.println("name is "+name);
//		System.out.println("email is "+email);
//		   Student studentFromDb = studentService.studentLogin(name, email);
//
//		    if(studentFromDb != null){
//		        return SUCCESS;
//		    }
//
//		    addActionError("Invalid login credentials");
//		    return INPUT;
//		
//	}
//	
//	
//	public void validateStudentLogin(){
//
//	    if(name == null || name.trim().isEmpty()){
//	        addFieldError("name", "Name is required for login");
//	    }
//
//	    if(email == null || email.trim().isEmpty()){
//	        addFieldError("email", "Email is required for login");
//	    }
//
//	    else if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
//	        addFieldError("email", "Invalid email format");
//	    }
//	}
//	
	
	
	
	

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
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
