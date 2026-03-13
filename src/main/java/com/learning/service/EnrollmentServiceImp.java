package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.EnrollmentDao;
import com.learning.exceptionhandling.EnrollmentException;

@Service
public class EnrollmentServiceImp implements EnrollmentService {
	
	@Autowired
	private EnrollmentDao enrollmentDao;

    public void enrollStudent(int studentId, String courseName) throws EnrollmentException {
    	enrollmentDao.enrollStudent(studentId, courseName);   
    }
}
