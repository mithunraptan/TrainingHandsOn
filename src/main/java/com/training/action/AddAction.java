package com.training.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.training.dao.UserDAO;
import com.training.model.User;

@Component
public class AddAction extends ActionSupport implements ModelDriven<User> {
	
	private User user = new User();
	
	@Autowired
	private UserDAO userDAO;
	
	public String execute() {
		userDAO.addUser(user);
		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
