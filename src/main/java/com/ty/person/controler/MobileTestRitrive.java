package com.ty.person.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.person.dto.Mobile;
import com.ty.person.dto.Sim;

public class MobileTestRitrive {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	    Mobile mobile=  entityManager.find(Mobile.class, 3);
			
	   System.out.println("id is "+mobile.getId());
	   System.out.println("name is "+mobile.getName());
	   System.out.println("cost is "+mobile.getCost());
	   
	   List<Sim> sims=mobile.getSim();
	   for(Sim s: sims) {
		   System.out.println("imrc is "+s.getImrc());
		   System.out.println("providers is "+s.getProvider());
	   }
	
}
}
