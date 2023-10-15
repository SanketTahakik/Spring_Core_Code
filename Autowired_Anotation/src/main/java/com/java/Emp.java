package com.java;

import java.net.Inet4Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp 
{
//	@Autowired
//	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("insdie setter");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Emp(Address address) {
		System.out.println("inside constructor");
		super();
		this.address = address;
	}

	
	
}
