package com.learning.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.entity.Admin;
import com.learning.service.AdminServiceImp;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	 private String username;
	 private String password;
	 
	 @Autowired
	 private AdminServiceImp adminServiceImp;

	 public String execute(){
		 //getting the admin from db
		 Admin admin = adminServiceImp.getAdmin(username, password);
		 if(admin!=null) {
			 return SUCCESS;
		 }
		 return INPUT;

	 }

	 public String getUsername(){ return username; }
	 public void setUsername(String username){ this.username=username; }

	 public String getPassword(){ return password; }
	 public void setPassword(String password){ this.password=password; }


}
