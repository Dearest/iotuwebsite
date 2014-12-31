package com.iotu.service;

import com.iotu.model.Comment;

public interface ICommentService {
	
	/**
	 * 保存评论
	 * @param comment
	 * @return  保存进数据库里的comment对象
	 * @throws Exception
	 */
	public Comment saveComment(Comment comment) throws Exception;
}
