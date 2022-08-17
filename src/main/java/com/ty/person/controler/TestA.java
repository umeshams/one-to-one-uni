package com.ty.person.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class TestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Person person=new Person();
	person.setAge(22);
	person.setName("ramu");
	
	Pan pan=new Pan();
	pan.setFatherName("hanji");
	pan.setPanNumber("ARHAG1234");
	
person.setPan(pan);
entityTransaction.begin();
entityManager.persist(person);
entityManager.persist(pan);
entityTransaction.commit();

	System.out.println("-------data stored----------");
	
	
	
}
}
