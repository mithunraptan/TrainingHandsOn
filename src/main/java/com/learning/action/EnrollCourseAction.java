package com.learning.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.exceptionhandling.EnrollmentException;
import com.learning.service.EnrollmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EnrollCourseAction extends ActionSupport {

    private int studentId;
    private String courseName;
    
    @Autowired
    private EnrollmentService enrollmentService;

    public String execute() throws EnrollmentException {
        Map<String,Object> session = ActionContext.getContext().getSession();
        int studentId = (int) session.get("studentId");
        enrollmentService.enrollStudent(studentId, courseName);

        return SUCCESS;
    }
    
    @Override
    public void validate() {

        if(studentId <= 0){
            addFieldError("studentId", "Student ID is required");
        }

        if(courseName == null || courseName.trim().isEmpty()){
            addFieldError("courseName", "Course name is required");
        }

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
