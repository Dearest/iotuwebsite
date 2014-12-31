package com.iotu.service.impl;

import com.iotu.dao.ICommentDao;
import com.iotu.model.Comment;
import com.iotu.service.ICommentService;

public class CommentSerIveImpl implements ICommentService{
	private ICommentDao commentDao;


	public void setCommentDao(ICommentDao commentDao) {
		this.commentDao = commentDao;
	}


	public Comment saveComment(Comment comment) throws Exception {
		
		return commentDao.saveComment(comment);
	}
}
