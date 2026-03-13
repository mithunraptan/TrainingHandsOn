package com.learning.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.entity.Course;
import com.learning.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class CourseAction extends ActionSupport implements ModelDriven<Course> {
	
	private Course course = new Course();
	
	@Autowired
	private CourseService courseService;
	
	@Override
	public String execute() throws Exception {
		courseService.addCourse(course);

		return SUCCESS;
	}
	
	
	@Override
	public void validate() {

	    if(course.getTitle() == null || course.getTitle().trim().isEmpty()){
	        addFieldError("title", "Course title is required");
	    }

	    if(course.getDescription() == null || course.getDescription().trim().isEmpty()){
	        addFieldError("description", "Course description is required");
	    }

	    if(course.getDuration() <= 0){
	        addFieldError("duration", "Course duration must be greater than 0 weeks");
	    }

	    if(course.getFee() <= 0){
	        addFieldError("fee", "Course fee must be greater than zero");
	    }

	}
	
	
	

	@Override
	public Course getModel() {
		// TODO Auto-generated method stub
		return course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
