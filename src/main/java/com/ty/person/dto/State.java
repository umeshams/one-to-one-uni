package com.ty.person.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
   @OneToOne
	private capital registerNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public capital getRegisterNo() {
	return registerNo;
}
public void setRegisterNo(capital registerNo) {
	this.registerNo = registerNo;
} 
	
}
