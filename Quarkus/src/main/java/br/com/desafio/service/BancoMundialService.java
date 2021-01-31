package br.com.desafio.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("")
@RegisterRestClient(configKey = "banco-mundial-api")
public interface BancoMundialService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object> listar();

}
