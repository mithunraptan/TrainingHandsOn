package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.learning.dao.CourseDao;
import com.learning.entity.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public void addCourse(Course course) {
		courseDao.addCourse(course);
		
	}

	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
