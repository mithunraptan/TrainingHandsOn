
package com.enterprise.dao;

import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.enterprise.model.Employee;
import com.enterprise.util.HibernateUtil;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
//	 EntityManager entityManager = emf.createEntityManager();
	
	
	//get the session
	Session session = HibernateUtil.getSessionFactory().openSession();
	//transaction

// @Override
// public List<Employee> findAll() {
//  // TODO  must implement JPA query
////	 return entityManager.createQuery("from Employee",Employee.class).getResultList();	 
// }
 

 @Override
 public void save(Employee employee) {
  // TODO  must implement persist logic
//	 entityManager.getTransaction().begin();
//	 entityManager.persist(employee);
//	 entityManager.getTransaction().commit();
		Transaction transaction = session.beginTransaction();


     session.save(employee);

     transaction.commit();
     session.close();
	 System.out.println("employee added successfully!!");
	 
 }

 @Override
 public List<Employee> findAll() {
	// TODO Auto-generated method stub
	return null;
 }

}
