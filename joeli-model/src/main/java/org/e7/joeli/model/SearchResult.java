package org.e7.joeli.model;

import java.util.Date;

public class SearchResult {

	private String fileName;
	private Date dateCreated;
	
	public SearchResult(String fileName, Date dateCreated) {
		super();
		this.fileName = fileName;
		this.dateCreated = dateCreated;
	}

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
