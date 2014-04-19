package com.joeli.api;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.joeli.core.FileDao;
import com.joeli.core.PdfDao;
import com.joeli.model.RiverResponse;

public class RiverPdfFileFacade implements RiverFileFacade {

	@Override
	public RiverResponse find(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException {
		FileDao fileDao = new PdfDao();
		fileDao.find(queryString);
		return new PdfDao().find(queryString);
	}

	public static void main(String[] args) {
		try {
			System.out.println(new PdfDao().find("Check"));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
