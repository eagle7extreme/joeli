package com.joeli.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Content {
	private String content;
	@JsonProperty("content_type")
	private String contentType;
	private String title;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
