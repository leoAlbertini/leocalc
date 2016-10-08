package br.edu.fcv.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/nomecompleto/{param1}/{param2}")
	public Response exibaSeuNomeCompleto(@PathParam("param1") String nome, @PathParam("param2") String sobrenome){
		String nm_comleto = nome + " " + sobrenome;
		return Response.status(200).entity(nm_comleto).build();
	}

}
