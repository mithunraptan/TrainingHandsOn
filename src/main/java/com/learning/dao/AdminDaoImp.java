package com.learning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.learning.entity.Admin;
import com.learning.util.HibernateUtil;

@Repository
public class AdminDaoImp implements AdminDao {

	@Override
	public void saveAdmin(Admin admin) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.getTransaction();
		transaction.begin();
		openSession.save(admin);
		transaction.commit();
		openSession.close();
		
	}

	@Override
	public Admin getAdmin(String name, String password) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		List<Admin> listOfAdmin = openSession.createQuery("from Admin where name= :name and password= :password",Admin.class)
		.setParameter("name", name)
		.setParameter("password", password)
		.list();
		//here i didn't use getSingleResult() -> cuz when there is no maching result in db then that time it will throw exception
		openSession.close();
		if(listOfAdmin.isEmpty()) {
			return null;
		}
		else {
			return listOfAdmin.get(0);
		}
		
		
		
	}

}
