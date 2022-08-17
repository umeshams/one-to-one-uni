package com.ty.person.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.person.dto.Company;
import com.ty.person.dto.Gst;

public class CompanyTestRitrive {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	      Gst gst= entityManager.find(Gst.class, 1);
	      System.out.println("id is "+gst.getId());
	      System.out.println("gst number is "+gst.getGstNumber());
	      System.out.println("status is "+gst.getStatus());
	    Company Company = gst.getCompany();
	      System.out.println("company name is"+Company.getName()
	      );
	     
	      System.out.println(" phone number "+Company.getPhone());
}
}
