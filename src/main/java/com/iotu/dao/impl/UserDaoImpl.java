package com.iotu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.iotu.dao.IUserDao;
import com.iotu.model.User;


public class UserDaoImpl implements IUserDao{
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public User findUserByProperty(String property,Object value) throws Exception {
		String hql = "FROM User u WHERE u."+property+" = :obj";

		return (User) sessionFactory.getCurrentSession().createQuery(hql).setParameter("obj", value).uniqueResult();
	}


	public List<User> findUserListByProperty(String property,Object value) throws Exception {
		// 返回list的方法没有实现
		return null;
	}
}
