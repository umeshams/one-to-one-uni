package com.ty.person.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Company;
import com.ty.person.dto.Gst;

public class CompanyTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=	entityManagerFactory.createEntityManager();

     EntityTransaction entityTransaction=entityManager.getTransaction();
     
     Company company=new Company();
     company.setName("tcs");
     company.setPhone(9876543212l);
     
     Gst gst=new Gst();
     gst.setGstNumber("res13121");
     gst.setStatus("active");
     
     gst.setCompany(company);
     
	entityTransaction.begin();
//	entityManager.persist(company);
//	entityManager.persist(gst);
	entityTransaction.commit();
	System.out.println("data stored");
}
}
