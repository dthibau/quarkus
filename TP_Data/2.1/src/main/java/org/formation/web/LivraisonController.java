package org.formation.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.formation.domain.Livraison;
import org.formation.service.LivraisonService;

import io.smallrye.mutiny.Multi;

@Path("/livraisons")
public class LivraisonController {

	private LivraisonService livraisonService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public Multi<Livraison> findAll() {
		return livraisonService.findAll();
	}

	
}
