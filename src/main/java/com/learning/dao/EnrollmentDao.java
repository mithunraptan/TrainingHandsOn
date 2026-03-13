package com.learning.dao;

import com.learning.exceptionhandling.EnrollmentException;

public interface EnrollmentDao {
	void enrollStudent(int studentId, String courseName) throws EnrollmentException;

}
