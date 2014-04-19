/**
 * 
 */
package com.joeli.core;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.joeli.model.RiverResponse;

/**
 * @author jgonzalez
 *
 */
public interface FileDao {

	public RiverResponse find(String queryString) throws NullPointerException, JsonParseException, JsonMappingException, IOException;
	public boolean insert(Object File);
}
