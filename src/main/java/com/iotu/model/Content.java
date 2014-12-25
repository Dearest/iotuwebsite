package com.iotu.model;

import java.util.Set;


@SuppressWarnings("serial")
public class Content implements java.io.Serializable {

	// Fields

	private Integer contentId;
	private User user;
	private String title;
	private String content;
	private Integer star;
	private Integer collectNum;
	private Set<ContentHasType> contentHasTypes ;
	private Set<Comment> comments ;
	private Set<Collect> collects ;

	// Constructors

	/** default constructor */
	public Content() {
	}

	/** minimal constructor */
	public Content(User user, String title, String content) {
		this.user = user;
		this.title = title;
		this.content = content;
	}

	/** full constructor */

	public Content(User user, String title, String content, Integer star,
			Integer collectNum, Set<ContentHasType> contentHasTypes, Set<Comment> comments, Set<Collect> collects) {
		this.user = user;
		this.title = title;
		this.content = content;
		this.star = star;
		this.collectNum = collectNum;
		this.contentHasTypes = contentHasTypes;
		this.comments = comments;
		this.collects = collects;
	}

	// Property accessors

	public Integer getContentId() {
		return this.contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStar() {
		return this.star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Integer getCollectNum() {
		return this.collectNum;
	}

	public void setCollectNum(Integer collectNum) {
		this.collectNum = collectNum;
	}

	public Set<ContentHasType> getContentHasTypes() {
		return this.contentHasTypes;
	}

	public void setContentHasTypes(Set<ContentHasType> contentHasTypes) {
		this.contentHasTypes = contentHasTypes;
	}

	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Collect> getCollects() {
		return this.collects;
	}

	public void setCollects(Set<Collect> collects) {
		this.collects = collects;
	}

}