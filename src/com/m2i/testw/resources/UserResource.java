package com.m2i.testw.resources;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.m2i.teste.UserEJB;
import com.m2i.teste.entities.User;


@ManagedBean
@Path("users")
public class UserResource {
	
	@EJB UserEJB userEJB; 
	
	@GET
	@Produces("application/json")
	public List<User> getUsers(){

		List<User> users = userEJB.findAll();
		
		return users ;
		
	}
	
	
}
