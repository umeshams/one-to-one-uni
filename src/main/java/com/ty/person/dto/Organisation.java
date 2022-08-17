package com.ty.person.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Organisation {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
	private int id;
	private String name;
	private String address;
	@OneToMany
	List<Bus> bus;
	
	
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
