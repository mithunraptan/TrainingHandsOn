package com.training.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.UserDAO;
import com.training.model.User;

@Component
public class SearchBookAction extends ActionSupport{
	private String bookName;

    private List<User> bookList;

    @Autowired
    private UserDAO userDAO;

    public String execute(){

        bookList = userDAO.searchBook(bookName);

        return SUCCESS;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public List<User> getBookList(){
        return bookList;
    }

}
