package com.learning.dao;

import java.util.List;

import com.learning.entity.Course;

public interface CourseDao {
	void addCourse(Course course);
	List<Course> getAllCourses();

}
