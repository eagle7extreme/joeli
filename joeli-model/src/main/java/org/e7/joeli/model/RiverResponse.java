package org.e7.joeli.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class RiverResponse {
	private long took;
	private boolean timed_out;
	@JsonProperty("_shards")
	private Shards shards;
	private HitContainer hits;
	
	
	public long getTook() {
		return took;
	}
	public void setTook(long took) {
		this.took = took;
	}
	public boolean isTimed_out() {
		return timed_out;
	}
	public void setTimed_out(boolean timed_out) {
		this.timed_out = timed_out;
	}
	public Shards getShards() {
		return shards;
	}
	public void setShards(Shards shards) {
		this.shards = shards;
	}
	public HitContainer getHits() {
		return hits;
	}
	public void setHits(HitContainer hits) {
		this.hits = hits;
	}
	
	
}
