package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.AdminDaoImp;
import com.learning.entity.Admin;

@Service
public class AdminServiceImp implements AdminService{


	
	@Autowired
	private AdminDaoImp adminDaoImp;

	@Override
	public void saveAdmin(Admin admin) {
		adminDaoImp.saveAdmin(admin);
		
		
	}

	@Override
	public Admin getAdmin(String name, String password) {
		return adminDaoImp.getAdmin(name, password);
		
	}

}
