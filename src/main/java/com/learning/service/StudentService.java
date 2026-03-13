package com.learning.service;

import java.util.List;

import com.learning.entity.Course;
import com.learning.entity.Student;

public interface StudentService {
	void registerStudent(Student student);
	List<Course> getCoursesByStudent(int studentId);
	Student studentLogin(String name, String email);

}
