package com.training.jpa;

import java.time.LocalDateTime;

import com.training.jpa.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");
		EntityManager em = emf.createEntityManager();
		if(em!=null) {
			System.out.println("connection established");
			
			//add products to db
//			EntityTransaction tx = em.getTransaction();
//			tx.begin();
//			Product product = new Product();
//			product.setProdName("Laptop");
//			product.setProdDesc("this is a electronics item");
//			product.setPrice(500000.00);
//			product.setCreatedAt(LocalDateTime.now());
//			//saving it to databse
//			em.persist(product);
//			
//			//commit the transaction
//			tx.commit();
//			System.out.println("product added successfully");
			
			//close the entity manager and entity manager factory
			em.close();
			emf.close();
			
			
		}
		else {
			System.out.println("not connected!!");
		}
	}

}
