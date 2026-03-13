package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.StudentDao;
import com.learning.entity.Course;
import com.learning.entity.Student;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void registerStudent(Student student) {
		System.out.println("service");
		studentDao.registerStudent(student);
		
	}

	@Override
	public List<Course> getCoursesByStudent(int studentId) {
		return studentDao.getCoursesByStudent(studentId);
	}

	@Override
	public Student studentLogin(String name, String email) {
		return studentDao.studentLogin(name, email);
	}

}
