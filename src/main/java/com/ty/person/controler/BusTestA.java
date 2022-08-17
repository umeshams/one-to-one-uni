package com.ty.person.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Bus;
import com.ty.person.dto.Organisation;

public class BusTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Organisation organisation=new Organisation();
	organisation.setName("gajanana");
	organisation.setAddress("shivamoga");
	
	List<Bus> bus= new ArrayList<Bus>();
	Bus bus1=new Bus();
	bus1.setType("sleeper");
	bus1.setCapacity(50);
	bus.add(bus1);
	
	
	Bus bus2=new Bus();
	bus2.setType("normal");
	bus2.setCapacity(75);
	bus.add(bus2);
	
	organisation.setBus(bus);
	
	entityTransaction.begin();
	entityManager.persist(organisation);
	
			entityManager.persist(bus1);
			entityManager.persist(bus2);
			entityTransaction.commit();
			System.out.println("-----data stored--------");
}
}
