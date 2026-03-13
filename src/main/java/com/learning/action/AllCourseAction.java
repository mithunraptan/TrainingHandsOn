package com.learning.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.entity.Course;
import com.learning.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class AllCourseAction extends ActionSupport {
	private List<Course> courses;
	
	@Autowired
	private CourseService courseService;
	
	@Override
	public String execute() throws Exception {
		courses = courseService.getAllCourses();
		return SUCCESS;
	}
	
	
	
	

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	

}
