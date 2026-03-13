package com.learning.service;

import com.learning.entity.Admin;

public interface AdminService {
	
	void saveAdmin(Admin admin);
	Admin getAdmin(String name, String password);

}
