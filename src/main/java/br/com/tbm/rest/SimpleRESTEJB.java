package br.com.tbm.rest;

import java.util.Date;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@Lock(LockType.READ)
@Path("/ejb")
public class SimpleRESTEJB {
	
	
	@PersistenceContext(unitName="ardnomweb")
	EntityManager entityManager;
	
	@Inject
	private UsuarioManager usuarioManager;
	
    @GET
    public String ejb() {
        return "ejb ok @ " + new Date().toString();
    }
}