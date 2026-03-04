package com.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.training.model.User;

@Repository
public class UserDAO {

    // Create factory only once
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPU");

    public User findByName(String name) {

        EntityManager em = emf.createEntityManager();

        TypedQuery<User> query =
                em.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);

        query.setParameter("name", name);

        User user = null;

        try {
            user = query.getSingleResult();
        } catch (Exception e) {
            user = null;
        }

        em.close();
        return user;
    }
}