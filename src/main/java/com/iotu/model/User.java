package com.iotu.model;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String name;
	private String password;
	private String salt;
	private String token;
	private Integer role;
	private String email;
	private String picture;
	private Set pictures = new HashSet(0);
	private Set contents = new HashSet(0);
	private Set collects = new HashSet(0);
	private Set chats = new HashSet(0);

	// Constructors

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

	/** full constructor */
	public User(String name, String password, String salt, String token,
			Integer role, String email, String picture, Set pictures,
			Set contents, Set collects, Set chats) {
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.token = token;
		this.role = role;
		this.email = email;
		this.picture = picture;
		this.pictures = pictures;
		this.contents = contents;
		this.collects = collects;
		this.chats = chats;
	}

	// Property accessors

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

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Set getPictures() {
		return this.pictures;
	}

	public void setPictures(Set pictures) {
		this.pictures = pictures;
	}

	public Set getContents() {
		return this.contents;
	}

	public void setContents(Set contents) {
		this.contents = contents;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

	public Set getChats() {
		return this.chats;
	}

	public void setChats(Set chats) {
		this.chats = chats;
	}

}