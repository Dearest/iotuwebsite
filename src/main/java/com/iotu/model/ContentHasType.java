package com.iotu.model;



@SuppressWarnings("serial")
public class ContentHasType implements java.io.Serializable {

	// Fields

	private ContentHasTypeId id;

	// Constructors

	/** default constructor */
	public ContentHasType() {
	}

	/** full constructor */
	public ContentHasType(ContentHasTypeId id) {
		this.id = id;
	}

	// Property accessors

	public ContentHasTypeId getId() {
		return this.id;
	}

	public void setId(ContentHasTypeId id) {
		this.id = id;
	}

}