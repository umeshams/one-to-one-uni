package com.ty.person.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.capital;
import com.ty.person.dto.State;

public class StateTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	State state=new State();
	state.setName("karnataka");
	
	capital capital=new capital();
	capital.setName("bengalur");
	capital.setRegisterNo(1);
	state.setRegisterNo(capital);
	entityTransaction.begin();
	
	entityManager.persist(state);
	entityManager.persist(capital);
	entityTransaction.commit();
	System.out.println("------data stored--------");
}
}
