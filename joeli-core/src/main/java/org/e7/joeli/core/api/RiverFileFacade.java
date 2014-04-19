package org.e7.joeli.core.api;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.e7.joeli.model.RiverResponse;

public interface RiverFileFacade {

	public RiverResponse find(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException;
	
}
