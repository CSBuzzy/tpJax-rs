package com.achatenligne.api;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.achatenligne.model.Produit;
import com.achatenligne.model.ProduitService;

@Path("/produits")
public class ProduitsResource {
	
	ProduitService produit = new ProduitService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produit> getAllProduits() {
		return produit.getAll();
	}
	
	//error  return {present:false}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Optional<Produit> getProduit(@QueryParam("id")int id) {
		return produit.getIdProduit(id);
	}
	
	//error 405
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/new")
	public Produit newProduct() {
		Produit pr = new Produit();
		return pr;
	}

//	@DELETE
//	public Produit retirer(@QueryParam("id")int id) {
//		return produit.remove(produit);
//	}
}
