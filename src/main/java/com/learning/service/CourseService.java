package com.learning.service;

import java.util.List;

import com.learning.entity.Course;

public interface CourseService {
	void addCourse(Course course);
	List<Course> getAllCourses();

}
