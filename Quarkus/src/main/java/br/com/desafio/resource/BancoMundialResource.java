package br.com.desafio.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.desafio.service.BancoMundialService;


@Path("/banco-mundial")
public class BancoMundialResource {
	@Inject
	@RestClient
	BancoMundialService bancoMundialService;
	
	@GET
	@Path("pais/{pais}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object> consultar(@PathParam("pais") String pais){
		return bancoMundialService.listar();
	}
	
}
