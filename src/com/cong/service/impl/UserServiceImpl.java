package com.cong.service.impl;

import com.cong.bean.User;
import com.cong.dao.UserDao;
import com.cong.dao.impl.UserDaoImpl;
import com.cong.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}

	@Override
	public boolean checkUserName(String username) {
		return userDao.checkUserName(username);
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

}
