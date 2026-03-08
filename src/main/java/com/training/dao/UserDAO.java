package com.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.training.model.User;

@Repository
public class UserDAO {
	EntityManagerFactory emf =
	        Persistence.createEntityManagerFactory("myPU");

	public void addUser(User user) {
		// TODO Auto-generated method stub

		EntityManager em = emf.createEntityManager();
		
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		}
		else {
			System.out.println("db not connected");
		}	
	}
	
	
	
	// VIEW ALL BOOKS
    public List<User> getAllBooks() {
    		EntityManager em = emf.createEntityManager();
			return em.createQuery("from User", User.class).getResultList();

    }

//    // SEARCH BOOK
    public List<User> searchBook(String bookName) {
    	EntityManager em = emf.createEntityManager();
        return em.createQuery(
                "from User where bookName=:bookName", User.class)
                .setParameter("bookName", bookName)
                .getResultList();
    }
//
//    // DELETE BOOK
    public void deleteBook(long id) {
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.remove(user);
        em.getTransaction().commit();
    }
//
    // GET BOOK BY ID
    public User getBookById(long id) {
    	EntityManager em = emf.createEntityManager();
        return em.find(User.class, id);
    }
//
//    // UPDATE BOOK
    public void updateBook(User user) {
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

	
	
	
	

}
