package com.iotu.service.impl;

import com.iotu.dao.IUserDao;
import com.iotu.model.User;
import com.iotu.service.IUserSerivce;
import com.iotu.util.SHA256Util;

public class UserServiceImpl implements IUserSerivce {
	private IUserDao userDao;

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) throws Exception {
		User findUser = userDao.findUserByProperty("name", user.getName());
		if (findUser == null) {
			return null;
		}

		if (findUser.getPassword().equals(
				SHA256Util.hash(user.getPassword() + findUser.getSalt()))) {
			findUser.setPassword(null);
			findUser.setSalt(null);
			findUser.setChats(null);
			findUser.setCollects(null);
			findUser.setContents(null);
			findUser.setPictures(null);
			return findUser;
		}
		return null;
	}

	public Boolean findToken(String token) throws Exception {
		// TODO 待写
		return null;
	}
}
