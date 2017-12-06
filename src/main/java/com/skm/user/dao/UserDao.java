package com.skm.user.dao;

import com.skm.user.model.User;

public interface UserDao {
	
	public void add(User user);

	public User loadByUser(String userName);
}
