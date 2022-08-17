package com.ty.person.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class TestB {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
Person person= 	entityManager.find(Person.class, 1);
System.out.println("id is "+person.getId());
System.out.println("name is "+person.getName());
System.out.println("age is "+person.getAge());
Pan pan=person.getPan();
System.out.println("pan number "+person.getPan().getPanNumber());
System.out.println("father name "+person.getPan().getFatherName());
}
}
