package com.training.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.training.dao.UserDAO;
import com.training.model.User;

@Component
public class EditBookAction extends ActionSupport implements ModelDriven<User>{
	 private User user = new User();

	    private long id;

	    @Autowired
	    private UserDAO userDAO;

	    public String execute(){

	        user = userDAO.getBookById(id);

	        return SUCCESS;
	    }

	    public User getModel(){
	        return user;
	    }

	    public void setId(long id){
	        this.id = id;
	    }
}
