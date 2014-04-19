package org.e7.joeli.data;

import java.io.IOException;

import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.e7.joeli.data.api.FileDao;
import org.e7.joeli.model.RiverResponse;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * url-ayuda: 
 *  1-http://howtodoinjava.com/2013/08/03/jax-rs-2-0-resteasy-3-0-2-final-client-api-example/ 
 *  2-http://www.mastertheboss.com/resteasy/resteasy-client-api-tutorial 
 * @author jgonzalez
 *
 */
public class PdfDao implements FileDao {
	ResteasyClient client;
	ResteasyWebTarget target;
	
	public PdfDao() {
		super();
		this.client = new ResteasyClientBuilder().build();
	}

	@Override
	public RiverResponse find(String queryString) throws NullPointerException, JsonParseException, JsonMappingException, IOException {
		Response response;
		this.target = this.client.target("http://localhost:9200/mongoindex/_search?q="+queryString);
		response = this.target.request().get();
		return new ObjectMapper().readValue(response.readEntity(String.class), RiverResponse.class);
	}

	@Override
	public boolean insert(Object File) {
		// TODO Auto-generated method stub
		return false;
	}

}
