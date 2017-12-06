package com.skm.user.dao;

import org.junit.Before;

public class TestUserDao {
	private UserDao userDao;
	
	@Before
	public void setUp(){
		userDao = new UserDaoImp();
	}
	
	
}
