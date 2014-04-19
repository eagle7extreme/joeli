/**
 * 
 */
package org.e7.joeli.data.api;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.e7.joeli.model.RiverResponse;


/**
 * @author jgonzalez
 *
 */
public interface FileDao {

	public RiverResponse find(String queryString) throws NullPointerException, JsonParseException, JsonMappingException, IOException;
	public boolean insert(Object File);
}
