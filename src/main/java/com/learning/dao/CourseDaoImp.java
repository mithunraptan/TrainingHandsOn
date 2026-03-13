package com.learning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.learning.entity.Course;
import com.learning.util.HibernateUtil;

@Repository
public class CourseDaoImp implements CourseDao {

	@Override
	public void addCourse(Course course) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.getTransaction();
		transaction.begin();
		openSession.save(course);
		transaction.commit();
		openSession.close();
		
	}

	@Override
	public List<Course> getAllCourses() {

	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session openSession = sessionFactory.openSession();

	    List<Course> courses = openSession.createQuery("from Course", Course.class).list();

	    openSession.close();

	    return courses;
	}
	

}
