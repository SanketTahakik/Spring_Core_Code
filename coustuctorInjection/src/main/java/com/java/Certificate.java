package com.java;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class Certificate 
{
	String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
