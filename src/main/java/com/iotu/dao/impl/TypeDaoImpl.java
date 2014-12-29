package com.iotu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.iotu.dao.ITypeDao;
import com.iotu.model.Type;

public class TypeDaoImpl implements ITypeDao{
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<Type> getTypes() throws Exception {
		// 博文类型的sql语句
		return null;
	}

}
