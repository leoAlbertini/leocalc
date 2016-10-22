package br.edu.fcv.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.edu.fcv.model.ApiResponse;
import br.edu.fcv.model.Produto;

@Path("/json/produto")
public class JSONService {

	@GET
	@Path("/listaprodutos")
	@Produces("application/json")
	public ApiResponse getListaProdutos() {
		List<Produto> novaLista = new ArrayList<Produto>();

		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);
		novaLista.add(produto);

		produto = new Produto();
		produto.setNome("Galaxy 7");
		produto.setQuantidade(15);
		novaLista.add(produto);

		produto = new Produto();
		produto.setNome("Iphone");
		produto.setQuantidade(5);
		novaLista.add(produto);

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setProdutos(novaLista);

		return apiResponse;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {

		String result = "Product created : " + produto;
		return Response.status(201).entity(result).build();

	}

}
