package com.iotu.model;

import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class User implements java.io.Serializable {

	

	private Integer userId;
	private String name;
	private String password;
	private String salt;
	private String token;
	private Integer role;
	private String email;
	private Set<Picture> pictures ;
	private Set<Content> contents ;
	private Set<Collect> collects  ;
	private Set<Chat> chats ;

	

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String password, String salt, String token,
			Integer role) {
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.token = token;
		this.role = role;
	}



	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	public Set<Collect> getCollects() {
		return collects;
	}

	public void setCollects(Set<Collect> collects) {
		this.collects = collects;
	}

	public Set<Chat> getChats() {
		return chats;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}



}