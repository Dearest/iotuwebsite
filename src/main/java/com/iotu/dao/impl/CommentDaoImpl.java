package com.iotu.dao.impl;

import org.hibernate.SessionFactory;

import com.iotu.dao.ICommentDao;

public class CommentDaoImpl implements ICommentDao{
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
