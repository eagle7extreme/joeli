package org.e7.joeli.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Hits {
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("_index")
	private String index;
	
	@JsonProperty("_score")
	private long score;
	
	@JsonProperty("_type")
	private String type;
	
	@JsonProperty("_source")
	private Source source;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
}
