package org.e7.joeli.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.e7.joeli.core.RiverPdfFileFacade;
import org.e7.joeli.model.RiverResponse;
import org.e7.joeli.model.SearchResult;
import org.e7.joeli.model.Source;
import org.elasticsearch.common.Base64;

@Path("/file")
public class RestPdf {
	
	
	public RestPdf() {
		super();
	}


	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(){
		return Response.ok("Hello World Rest").build();
	}
	
	
	@GET
	@Path("/pdf")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findSummary(@QueryParam("q") String fileContent){
		byte[] content = {Byte.MIN_VALUE};
		try {
			List<SearchResult> arlSource = new RiverPdfFileFacade().findSummary(fileContent);
			return Response.ok(arlSource).build();
		} catch (IOException e) {;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.ok(content).build();
	}

	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response find(@QueryParam("q") String fileContent){
		byte[] content = {Byte.MIN_VALUE};
		try {
			RiverResponse riverResponse = new RiverPdfFileFacade().find(fileContent); 
			content = Base64.decode(riverResponse.getHits().getArlHits().get(0).getSource().getContent().getContent());
		} catch (IOException e) {;
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return Response.ok(content).build();
	}
	
}
