package com.training.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.UserDAO;

@Component
public class DeleteBookAction extends ActionSupport {
	private long id;

    @Autowired
    private UserDAO userDAO;

    public String execute(){

        userDAO.deleteBook(id);

        return SUCCESS;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

}
