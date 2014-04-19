package com.joeli.api;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.joeli.model.RiverResponse;

public interface RiverFileFacade {

	public RiverResponse find(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException;
	
}
