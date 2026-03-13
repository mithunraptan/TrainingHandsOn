package com.learning.dao;

import java.util.List;

import com.learning.entity.Course;
import com.learning.entity.Student;

public interface StudentDao {
	void registerStudent(Student student);
	List<Course> getCoursesByStudent(int studentId);
	Student studentLogin(String name, String email);

}
