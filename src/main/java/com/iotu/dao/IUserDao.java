package com.iotu.dao;

import java.util.List;

import com.iotu.model.User;

public interface IUserDao {
	
	public User findUserByProperty(String property,Object value) throws Exception;
	public List<User> findUserListByProperty(String property,Object value) throws Exception;
}
