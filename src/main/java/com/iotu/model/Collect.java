package com.iotu.model;



@SuppressWarnings("serial")
public class Collect implements java.io.Serializable {

	// Fields

	private Integer collectId;
	private User user;
	private Content content;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** full constructor */
	public Collect(User user, Content content) {
		this.user = user;
		this.content = content;
	}

	// Property accessors

	public Integer getCollectId() {
		return this.collectId;
	}

	public void setCollectId(Integer collectId) {
		this.collectId = collectId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

}