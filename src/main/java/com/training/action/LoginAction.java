package com.training.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.UserDAO;
import com.training.model.User;

@Component
public class LoginAction extends ActionSupport{
    
    private String username;
    private String password;
    
    
    
     public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


//
//	 public String execute() {
//
//		 HttpSession session = ServletActionContext.getRequest().getSession();
//		 
//		 
//            if ("admin".equals(username) && "123".equals(password)) {
//            	session.setAttribute("role", "ADMIN");
//                return "admin";
//            }
//
//            if ("customer".equals(username) && "123".equals(password)) {
//            	session.setAttribute("role", "CUSTOMER");
//                return "customer";
//            }
//            
//            return ERROR;
//        }

	@Autowired
    private UserDAO userDAO;
	
	public String execute() {

	    HttpSession session = ServletActionContext.getRequest().getSession();

//	    UserDAO dao = new UserDAO();
//	    User user = dao.findByName(username);
	    User user = userDAO.findByName(username);
	    if (user == null) {
	        addActionError("User not found");
	        return ERROR;
	    }

	    if (!user.getPassword().equals(password)) {
	        addActionError("Invalid password");
	        return ERROR;
	    }

	    session.setAttribute("role", user.getRole());

	    if ("ADMIN".equals(user.getRole())) {
	        return "admin";
	    }

	    if ("CUSTOMER".equals(user.getRole())) {
	        return "customer";
	    }

	    return ERROR;
	}
	
	
	
}