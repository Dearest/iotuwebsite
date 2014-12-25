package com.iotu.model;

/**
 * Present entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Present implements java.io.Serializable {

	// Fields

	private Integer presentId;
	private String content;
	private Integer position;
	private String description;

	// Constructors

	/** default constructor */
	public Present() {
	}

	/** minimal constructor */
	public Present(String content, Integer position) {
		this.content = content;
		this.position = position;
	}

	/** full constructor */
	public Present(String content, Integer position, String description) {
		this.content = content;
		this.position = position;
		this.description = description;
	}

	// Property accessors

	public Integer getPresentId() {
		return this.presentId;
	}

	public void setPresentId(Integer presentId) {
		this.presentId = presentId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}