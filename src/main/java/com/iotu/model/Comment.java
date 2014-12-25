package com.iotu.model;

import java.util.Date;




/**
 * 评论
 * @author hanchen
 *
 */
@SuppressWarnings("serial")
public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Content content;
	private Picture picture;
	private String fromUser;
	private String toUser;
	private Date time;
	private String content_1;
	private Integer isRecomment;
	private Integer recommentId;

	// Constructors

	/** default constructor */
	public Comment() {
	}


	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Picture getPicture() {
		return this.picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public String getToUser() {
		return this.toUser;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}



	public String getContent_1() {
		return this.content_1;
	}

	public void setContent_1(String content_1) {
		this.content_1 = content_1;
	}

	public Integer getIsRecomment() {
		return this.isRecomment;
	}

	public void setIsRecomment(Integer isRecomment) {
		this.isRecomment = isRecomment;
	}

	public Integer getRecommentId() {
		return this.recommentId;
	}

	public void setRecommentId(Integer recommentId) {
		this.recommentId = recommentId;
	}




	public Date getTime() {
		return time;
	}




	public void setTime(Date time) {
		this.time = time;
	}

}