package com.iotu.model;

import java.sql.Timestamp;


@SuppressWarnings("serial")
public class Chat implements java.io.Serializable {

	// Fields

	private Integer chatId;
	private User user;
	private String content;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Chat() {
	}

	/** full constructor */
	public Chat(User user, String content, Timestamp time) {
		this.user = user;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getChatId() {
		return this.chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}