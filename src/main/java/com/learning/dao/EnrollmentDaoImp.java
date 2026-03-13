package com.learning.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.learning.entity.Course;
import com.learning.entity.Student;
import com.learning.exceptionhandling.EnrollmentException;
import com.learning.util.HibernateUtil;

@Repository
public class EnrollmentDaoImp implements EnrollmentDao {

    @Override
    public void enrollStudent(int studentId, String courseName) throws EnrollmentException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session openSession = sessionFactory.openSession();
        Transaction transaction = openSession.beginTransaction();

        Student student = openSession.get(Student.class, studentId);

        if(student == null){
            throw new EnrollmentException("Student not found");
        }

        Query<Course> q = openSession.createQuery(
                "from Course where title = :title", Course.class);

        q.setParameter("title", courseName);

        Course course = q.uniqueResult();

        if(course == null){
            throw new EnrollmentException("Course not found");
        }

        if(student.getCourses().contains(course)){
            throw new EnrollmentException("Student already enrolled in this course");
        }

        student.getCourses().add(course);

        openSession.saveOrUpdate(student);

        transaction.commit();
        openSession.close();
    }
}