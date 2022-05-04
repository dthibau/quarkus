package org.formation.web;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.formation.domain.ProductRequest;
import org.formation.domain.Ticket;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/tickets")
public class TicketResource {

	@GET
	public List<Ticket> findAll() {
		return null;
	}
	
	@POST
	public Ticket acceptOrder(@RestQuery Long orderId, List<ProductRequest> productsRequest) {
		return null;
	}
	
	@POST
	@Path("/{ticketId}/pickup")
	public Ticket noteTicketReadyToPickUp(@RestPath Long ticketId) {
		return null;
	}
}
