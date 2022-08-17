package com.ty.person.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import com.ty.person.dto.Mobile;
import com.ty.person.dto.Sim;

public class MobileTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Mobile mobile=new Mobile();
	mobile.setName("nokia");
	mobile.setCost(120000);
	//mobile.se
	List<Sim > s=new ArrayList<Sim>();
	Sim sim1=new Sim();
	sim1.setProvider("vodafone");
	sim1.setImrc(1234567890);
	s.add(sim1);
	Sim sim2=new Sim();
	sim2.setProvider("jio");
	sim2.setImrc(1234567878);
	s.add(sim2);
	
	
	
	
	mobile.setSim(s);
	entityTransaction.begin();
	entityManager.persist(mobile);
	entityManager.persist(sim1);
	entityManager.persist(sim2);
	
	entityTransaction.commit();
	System.out.println("--------dota stored-----------");
}
}
