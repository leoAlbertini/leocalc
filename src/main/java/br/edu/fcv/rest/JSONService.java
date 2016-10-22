package br.edu.fcv.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.edu.fcv.dao.LembreteDao;
import br.edu.fcv.dao.ProdutoDao;
import br.edu.fcv.model.ApiResponse;
import br.edu.fcv.model.Lembrete;
import br.edu.fcv.model.Produto;

@Path("/json/produto")
public class JSONService {
	ProdutoDao dao = new ProdutoDao();
	@GET
	@Path("/listaprodutos")
	@Produces("application/json")
	public ApiResponse getListaProdutos() {
		List<Produto> novaLista = dao.list();

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setProdutos(novaLista);

		return apiResponse;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {
		
		dao.save(produto);
		return Response.status(201).entity("ok").build();

	}

}
