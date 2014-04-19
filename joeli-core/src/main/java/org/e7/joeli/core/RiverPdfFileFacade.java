package org.e7.joeli.core;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.e7.joeli.core.api.RiverFileFacade;
import org.e7.joeli.data.PdfDao;
import org.e7.joeli.data.api.FileDao;
import org.e7.joeli.model.RiverResponse;


public class RiverPdfFileFacade implements RiverFileFacade {

	@Override
	public RiverResponse find(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException {
		FileDao fileDao = new PdfDao();
		fileDao.find(queryString);
		return new PdfDao().find(queryString);
	}
}
