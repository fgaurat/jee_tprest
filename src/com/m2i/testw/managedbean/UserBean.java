package com.m2i.testw.managedbean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.m2i.teste.UserEJB;
import com.m2i.teste.entities.User;

@ManagedBean 
@RequestScoped
@Named

public class UserBean {
	
	@EJB UserEJB userEJB;
	
	
	public List<User> usersList() {
		System.out.println("usersList");
        return userEJB.findAll();
    }
	
}
