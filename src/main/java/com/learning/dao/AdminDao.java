package com.learning.dao;

import com.learning.entity.Admin;

public interface AdminDao {
	void saveAdmin(Admin admin);
	Admin getAdmin(String name, String password);

}
