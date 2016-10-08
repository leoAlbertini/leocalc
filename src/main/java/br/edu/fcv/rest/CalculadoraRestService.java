package br.edu.fcv.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraRestService {

	@GET
	@Path("/soma/{param1}/{param2}")
	public Response soma(@PathParam("param1") int num1, @PathParam("param2") int num2) {
		String result = "A soma : " + (num1+num2);
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/subtracao/{param1}/{param2}")
	public Response subtracao(@PathParam("param1") int num1, @PathParam("param2") int num2) {
		String result = "A subtracao : " + (num1-num2);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/divisao/{param1}/{param2}")
	public Response divisao(@PathParam("param1") int num1, @PathParam("param2") int num2) {
		if(num2 == 0)
			return Response.status(200).entity("nao pode dividir por zero").build();
		String result = "A divisao : " + (num1/num2);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/multiplicacao/{param1}/{param2}")
	public Response multiplicacao(@PathParam("param1") int num1, @PathParam("param2") int num2) {
		String result = "A multiplicacao : " + (num1*num2);
		return Response.status(200).entity(result).build();
	}
}
