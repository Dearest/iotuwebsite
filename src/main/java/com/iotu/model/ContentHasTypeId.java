package com.iotu.model;


@SuppressWarnings("serial")
public class ContentHasTypeId implements java.io.Serializable {

	// Fields

	private Content content;
	private Type type;

	// Constructors

	/** default constructor */
	public ContentHasTypeId() {
	}

	/** full constructor */
	public ContentHasTypeId(Content content, Type type) {
		this.content = content;
		this.type = type;
	}

	// Property accessors

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContentHasTypeId))
			return false;
		ContentHasTypeId castOther = (ContentHasTypeId) other;

		return ((this.getContent() == castOther.getContent()) || (this
				.getContent() != null && castOther.getContent() != null && this
				.getContent().equals(castOther.getContent())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getContent() == null ? 0 : this.getContent().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}