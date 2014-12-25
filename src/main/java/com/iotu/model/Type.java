package com.iotu.model;

import java.util.Set;

@SuppressWarnings("serial")
public class Type implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String type;
	private Set<ContentHasType> contentHasTypes;

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(String type) {
		this.type = type;
	}

	/** full constructor */
	public Type(String type, Set<ContentHasType> contentHasTypes) {
		this.type = type;
		this.contentHasTypes = contentHasTypes;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<ContentHasType> getContentHasTypes() {
		return this.contentHasTypes;
	}

	public void setContentHasTypes(Set<ContentHasType> contentHasTypes) {
		this.contentHasTypes = contentHasTypes;
	}

}