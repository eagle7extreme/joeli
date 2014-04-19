package com.joeli.model;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class HitContainer {

	@JsonProperty("max_score")
	private long maxScore;
	private long total;
	
	@JsonProperty("hits")
	private ArrayList<Hits> arlHits;
	
	public long getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(long maxScore) {
		this.maxScore = maxScore;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public ArrayList<Hits> getArlHits() {
		return arlHits;
	}
	public void setArlHits(ArrayList<Hits> arlHits) {
		this.arlHits = arlHits;
	}
}
