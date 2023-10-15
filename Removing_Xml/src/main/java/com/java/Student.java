package com.java;

import org.springframework.stereotype.Component;

@Component("friststudent")
public class Student 
{
	public void study()
	{
		System.out.println("student is reading book");
	}
}
