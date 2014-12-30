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

	private Integer commentId; //评论id
	private Content content;   //外键 针对哪条博文的评论
	private Picture picture;   //外键  针对哪张图片的评论
	private String fromUser;    //评论人的昵称 若为游客则使用自己输入的昵称
	private String toUser;     //被评论人的昵称
	private Date time;         //发表评论的时间
	private String commentary;  //评论的内容
	private Integer isRecomment; //是否是对评论的回复  1是 0 后
	private Integer recommentId; //若是对评论的回复 则recommentId是被回复的评论的id

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



	public String getCommentary() {
		return this.commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
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