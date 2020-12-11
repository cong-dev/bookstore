package com.cong.test;

import org.junit.jupiter.api.Test;

import com.cong.bean.User;
import com.cong.dao.UserDao;
import com.cong.dao.impl.UserDaoImpl;

class UserDaoImplTest {

	private UserDao userDao = new UserDaoImpl();
	@Test
	void testGetUser() {
		User user = userDao.getUser(new User(null, "王聪", "123456", null));
		System.out.println(user);
	}

	@Test
	void testCheckUserName() {
		boolean yOn = userDao.checkUserName("test01d");
		System.out.println(yOn);
	}

	
}
