package com.iotu.dao.impl;

import org.hibernate.SessionFactory;

import com.iotu.dao.ICommentDao;
import com.iotu.model.Comment;

public class CommentDaoImpl implements ICommentDao{
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Comment saveComment(Comment comment) throws Exception {
		sessionFactory.getCurrentSession().save(comment);
		return comment;
	}
}
