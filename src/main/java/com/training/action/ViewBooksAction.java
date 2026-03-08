package com.training.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.UserDAO;
import com.training.model.User;

@Component
public class ViewBooksAction extends ActionSupport {
	
	@Autowired
    private UserDAO userDAO;

    private List<User> bookList;

    public String execute(){

        bookList = userDAO.getAllBooks();

        return SUCCESS;
    }

    public List<User> getBookList(){
        return bookList;
    }

}
