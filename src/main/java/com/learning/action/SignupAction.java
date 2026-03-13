package com.learning.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.entity.Admin;
import com.learning.service.AdminServiceImp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Controller
public class SignupAction extends ActionSupport implements ModelDriven<Admin>{
	
	private Admin admin = new Admin();
	
	@Autowired
	private AdminServiceImp adminServiceImp;
	
	@Override
	public String execute() throws Exception {
		adminServiceImp.saveAdmin(admin);
		
		
		
		return SUCCESS;
	}


	
	
	@Override
	public void validate() {

	    if(admin.getName() == null || admin.getName().trim().isEmpty()){
	        addFieldError("name", "Name is required");
	    }

	    if(admin.getPassword() == null || admin.getPassword().trim().isEmpty()){
	        addFieldError("password", "Password is required");
	    }

	    if(admin.getPassword() != null && admin.getPassword().length() < 6){
	        addFieldError("password", "Password must be at least 6 characters");
	    }
	}
	
	

	public Admin getAdmin() {
		return admin;
	}




	public void setAdmin(Admin admin) {
		this.admin = admin;
	}




	@Override
	public Admin getModel() {
		return admin;
	}
	
	
	

}
