package com.learning.service;

import com.learning.exceptionhandling.EnrollmentException;

public interface EnrollmentService {
	void enrollStudent(int studentId, String courseName)throws EnrollmentException ;

}
