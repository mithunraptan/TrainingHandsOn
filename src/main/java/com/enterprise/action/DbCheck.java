package com.enterprise.action;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.opensymphony.xwork2.ActionSupport;

public class DbCheck extends ActionSupport{
	 public String execute() {
		  // TODO  must integrate Spring bean and call service
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		 EntityManager em = emf.createEntityManager();
		 if(em!=null) {
			 System.out.println("db connected!!");
		  return SUCCESS;
		 }
		 return "failure";
	 }

}
