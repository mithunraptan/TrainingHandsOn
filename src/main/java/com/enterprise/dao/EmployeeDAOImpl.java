
package com.enterprise.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enterprise.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	 EntityManager entityManager = emf.createEntityManager();

 @Override
 public List<Employee> findAll() {
  // TODO  must implement JPA query
	 return entityManager.createQuery("from Employee",Employee.class).getResultList();	 
 }
 

 @Override
 public void save(Employee employee) {
  // TODO  must implement persist logic
	 entityManager.getTransaction().begin();
	 entityManager.persist(employee);
	 entityManager.getTransaction().commit();
	 System.out.println("employee added successfully!!");
	 
 }

}
