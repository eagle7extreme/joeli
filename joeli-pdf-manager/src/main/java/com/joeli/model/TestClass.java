package com.joeli.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class TestClass {
	@JsonProperty("_took")
	String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
