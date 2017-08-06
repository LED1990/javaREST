package com.mytests;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/class")
public class Aservice {
	/* for later!
	  	@Produces("text/plain"): for downloading text file.
		@Produces("image/png"): for downloading png image file.
		@Produces("application/pdf"): for downloading PDF file.
		@Produces("application/vnd.ms-excel"): for downloading excel file.
		@Produces("application/msword"): for downloading ms word file.
	 */

	/*
	 * @GET specifies type of request. If clinet send GET http request this
	 * method will be invoked
	 * 
	 * @Produces defines type of response representation. In this case resposne
	 * will be XML type (we also can use JSON etc.)
	 * 
	 * if use XML or HTML etc. remember to keep proper formating in response!!!!
	 */
	
	@GET
	@Produces("text/plain")
	public String textresponse() {
		return "plain text. No XML, JSON or other type requested!";
	}
	@GET
	@Produces("application/xml")
	@Path("/xml")
	public String xmlresponse(){
		return  "<?xml version=\"1.0\"?>" + "<hello> XML format, forced by path not request from clinet!. I invoked "
				+ "specific path in browser to invoke method that returns XML response" + "</hello>";  
	}
	/*
	 * passing params example
	 * @PathParam - use to bind value passed from browser bar to veriable. Can be used only as method argument
	 * THIS IS NOT PARAM: KEY - VALUE PAIR
	 * example:
	 * http://localhost:8080/RestTutorial/webxml/class/xml/1/1/1
	 */
	@GET
	@Path("/xml/{var1}/{var2}/{var3}")
	@Produces("application/xml")
	public String pathParamExample(@PathParam("var1") int x1,@PathParam("var2") int x2){
		int sum = x1+x2;		
		 
		return  "<?xml version=\"1.0\"?>" + "<hello> resposnse with xml format. passed param values: "+x1+" "+x2+
				" and sum: "+sum+ "</hello>";  
	}
	/*
	 * @QueryParam - use to bind value passed as param (key-vale pair) to veriable
	 * can be used only as method argument
	 * example how to send param vale: ?key = value
	 * full example
	 * http://localhost:8080/RestTutorial/webxml/class/textquery?param1=20
	 * or use postman
	 */
	@GET
	@Path("/textquery")
	@Produces("text/plain")
	public String queryParamExample(@QueryParam("param1")String par){
		return "param value binded with @QueryParam: "+par;
	}
	/*
	 * @Post - indicate to resposne for POST request
	 * other annotations as before
	 */
	@POST
	@Path("/postexample")
	@Produces("text/plain")
	public String postExample(@QueryParam("param1")String par){
		return "resposne for post request "+"and param: "+par;
	}
	
}
