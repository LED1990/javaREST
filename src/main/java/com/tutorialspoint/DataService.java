package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/dataService")
public class DataService {
	DataDAO ddao = new DataDAO();
	
	@GET
	@Path("/data")
	@Produces("application/xml")
	public List<Data> getAll(){
		return ddao.getAllData();
	}

}
