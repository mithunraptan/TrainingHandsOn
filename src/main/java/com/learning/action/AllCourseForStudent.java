package com.learning.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.entity.Course;
import com.learning.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AllCourseForStudent extends ActionSupport {
	
	private List<Course> courses;
//	private int studentId;
	
	@Autowired
	private StudentService studentService;
	

	
	@Override
	public String execute() throws Exception {
	    Map<String,Object> session = ActionContext.getContext().getSession();
	    int studentId = (int) session.get("studentId");
	    List<Course> coursesByStudent = studentService.getCoursesByStudent(studentId);
	    courses = coursesByStudent;
		return SUCCESS;
	}





	public List<Course> getCourses() {
		return courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}




	
	
	

}
