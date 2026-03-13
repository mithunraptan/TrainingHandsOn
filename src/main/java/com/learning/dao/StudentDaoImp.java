package com.learning.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.learning.entity.Course;
import com.learning.entity.Student;
import com.learning.util.HibernateUtil;

@Repository
public class StudentDaoImp implements StudentDao {

	@Override
	public void registerStudent(Student student) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.getTransaction();
		transaction.begin();
		openSession.save(student);
		transaction.commit();
		openSession.close();
		
	}

	@Override
	public List<Course> getCoursesByStudent(int studentId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Student student = openSession.get(Student.class, studentId);
		List<Course> courses = new ArrayList();
		Set<Course> setOfCourses = student.getCourses();
		courses.addAll(setOfCourses);
		System.out.println("course count issss "+ courses.size());
		openSession.close();
		return courses;
	}

	@Override
	public Student studentLogin(String name, String email) {

	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session openSession = sessionFactory.openSession();

	    List<Student> listOfStudents = openSession
	            .createQuery("from Student where name = :name and email = :email", Student.class)
	            .setParameter("name", name)
	            .setParameter("email", email)
	            .list();

	    // not using getSingleResult() because it throws exception if no result found

	    openSession.close();

	    if(listOfStudents.isEmpty()) {
	        return null;
	    } 
	    else {
	        return listOfStudents.get(0);
	    }
	}

}
