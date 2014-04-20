package org.e7.joeli.core;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.e7.joeli.core.api.RiverFileFacade;
import org.e7.joeli.data.PdfDao;
import org.e7.joeli.data.api.FileDao;
import org.e7.joeli.model.RiverResponse;
import org.e7.joeli.model.SearchResult;
import org.e7.joeli.model.Source;


public class RiverPdfFileFacade implements RiverFileFacade {

	@Override
	public RiverResponse find(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException {
		FileDao fileDao = new PdfDao();
		fileDao.find(queryString);
		return new PdfDao().find(queryString);
	}
	
	public ArrayList<SearchResult> findSummary(String queryString) throws JsonParseException, JsonMappingException, NullPointerException, IOException {
		FileDao fileDao = new PdfDao();
		RiverResponse rv = fileDao.find(queryString);
		ArrayList<SearchResult> arlSource = new ArrayList<SearchResult>();
		for (int i = 0; i < rv.getHits().getArlHits().size(); i++) {
			Source source = rv.getHits().getArlHits().get(i).getSource();
			
			arlSource.add(new SearchResult(source.getContent().getTitle(), source.getUploadDate()));
		}
		return arlSource;
	}
}
